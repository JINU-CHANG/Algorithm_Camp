package week2.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public interface H_13 {
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
    Queue<Integer> queue = new LinkedList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int ans = 0;

    int[][] arr = new int[N][M];
    int[][] chk = new int[N][M];
    int[][] dis = new int[N][M];

    for(int i=0;i<N;i++){
        String s = br.readLine();
        for(int j=0;j<M;j++){
            arr[i][j] = s.charAt(j)-'0';
        }
    }

    queue.offer(0);
    queue.offer(0);
    queue.offer(1);
    
    while(!queue.isEmpty()){
        int x = queue.poll();
        int y = queue.poll();
        int d = queue.poll();

        if( x<0 || y<0 || x>N-1 || y>M-1) continue;
        if( arr[x][y]==0 || chk[x][y] == 1) continue;
        chk[x][y] = 1;
        dis[x][y] = d;

        for(int i=0;i<4;i++){
            queue.offer(x+dx[i]);
            queue.offer(y+dy[i]);
            queue.offer(d+1);
        }
    }

    if(dis[N-1][M-1]==0) System.out.println(-1);
    else System.out.println(dis[N-1][M-1]);

}
}
