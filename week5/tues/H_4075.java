package week5.tues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_4075 {
    static int[][] arr;
    static int N;
    static boolean[][] chk;
    static int[] dx = {1,0};
    static int[] dy = {0,1};
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());

    arr = new int[N][N];
    chk = new boolean[N][N];

    for(int i=0; i<N; i++) {
        String s = br.readLine();
        for(int j=0; j<s.length(); j++) {
            if(s.charAt(j)=='.') arr[i][j] = 0;
            else arr[i][j] = 1;
        }
    }
    
    dfs(0,0);
    System.out.println(cnt);

    }

    public static void dfs(int x, int y){ //시간 복잡도 : (가지수) ^ (높이) -> 2 ^ 1000
        if(x < 0 || x > N-1 || y<0 || y>N-1) return;
        if(chk[x][y]==true || arr[x][y]==1) return;
        if(x == N-1 && y == N-1) {
            cnt ++;
            return;
        }
        chk[x][y] = true;

        for(int i=0; i<2; i++) {
            dfs(x+dx[i], y + dy[i]);
        }

        chk[x][y] = false;
    }
}
