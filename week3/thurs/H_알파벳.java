package week3.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_알파벳 {
    static int[] chk;
    static char[][] arr;
    static int max = -1;
    static int R; //세로
    static int C; //가로
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    R = Integer.parseInt(st.nextToken());
    C = Integer.parseInt(st.nextToken());

    arr = new char[R][C];

    for(int i=0; i<R; i++){
        String s = br.readLine();
        for(int j=0; j<C; j++){
            arr[i][j] = s.charAt(j);
        }
    }

    chk = new int[26];
    dfs(0,0,1);
    System.out.println(max);
}
    public static void dfs(int x, int y, int d){ //x=세로, y=가로
        if(x<0 || y<0 || x>R-1 || y>C-1) return;
        int temp = (int)arr[x][y] - 65;
        if(chk[temp] == 1) return;
        chk[temp] = 1;

        for(int i=0;i<4;i++) {
            dfs(x+dx[i],y+dy[i], d+1);
        }

        max = Math.max(d,max);
        chk[temp] = 0;
        
    }
}
