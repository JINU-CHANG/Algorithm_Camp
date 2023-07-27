package week2.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class H_4699 {
      static int dx[] = {-1,1,0,0};
      static int dy[] = {0,0,-1,1};
      static int w;
      static int h;
      static int[][] fM;
      static int[][] wM;
      static int[][] fDist;
      static int[][] wDist;
      public static void main(String[] args) throws IOException {
      Queue<Integer> fQ = new LinkedList<>();
      Queue<Integer> wQ = new LinkedList<>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;

      st = new StringTokenizer(br.readLine());
      h = Integer.parseInt(st.nextToken());
      w = Integer.parseInt(st.nextToken());

      fM = new int[w][h];
      wM = new int[w][h];
      fDist = new int[w][h];
      wDist = new int[w][h];

      for(int i=0;i<w;i++){
        String s = br.readLine();
        for(int j=0;j<h;j++){
            if(s.charAt(j)=='#'){
                fM[i][j] = 1;
                wM[i][j] = 1;
            }else if(s.charAt(j)=='*'){
                fQ.offer(i);
                fQ.offer(j);
                fQ.offer(1);
            } else if(s.charAt(j)=='@'){
                wQ.offer(i);
                wQ.offer(j);
                wQ.offer(1);
            } else {
                fM[i][j] = 0;
                wM[i][j] = 0;
            }
      }
    }

    //불
    while(!fQ.isEmpty()){
        int x = fQ.poll();
        int y = fQ.poll();
        int d = fQ.poll();

        if(x<0 || y<0 || x>w-1 || y>h-1) continue;
        if(fM[x][y]==1 || fDist[x][y]>0) continue;
        fDist[x][y] = d;

        for(int i=0;i<4;i++){
            fQ.offer(x+dx[i]);
            fQ.offer(y+dy[i]);
            fQ.offer(d+1);
        }
    }
    //사람
    while(!wQ.isEmpty()){
        int x_ = wQ.poll();
        int y_ = wQ.poll();
        int d_ = wQ.poll();

        if(x_<0 || y_<0 || x_>w-1 || y_>h-1) continue;
        if(fDist[x_][y_] !=0 && fDist[x_][y_]<=d_) continue;
        if(wM[x_][y_]==1 || wDist[x_][y_]>0) continue;
        wDist[x_][y_] = d_;

        for(int i=0;i<4;i++){
            wQ.offer(x_+dx[i]);
            wQ.offer(y_+dy[i]);
            wQ.offer(d_+1);
        }
    }
    
}
}