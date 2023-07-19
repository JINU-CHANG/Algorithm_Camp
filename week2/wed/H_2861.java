package week2.wed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class H_2861 {
    static int N;
    static int[][] arr;
    static boolean[][] chk;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int cnt;
    static ArrayList<Integer> ans = new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());

    arr = new int[N][N];
    chk = new boolean[N][N];

    for(int i=0; i<N; i++){
        String str = br.readLine();
        for(int j=0; j<N; j++){
            arr[i][j] = str.charAt(j) - '0';
        }
    }

    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            if(arr[i][j] == 1 && chk[i][j] == false){
                cnt = 0;
                dfs(i,j);
                ans.add(cnt);
            }
        }
    }

    Collections.sort(ans);

    System.out.println(ans.size());
    for(int i=0; i<ans.size();i++){
        System.out.println(ans.get(i));
    }

    }
    public static void dfs(int x, int y){

        if(x < 0 || y < 0 || x>N-1 || y>N-1) return;
        if(arr[x][y] != 1 || chk[x][y]==true) return;
        chk[x][y] = true;
        cnt ++;

        for(int i=0; i<4;i++){
            int x_ = x + dx[i];
            int y_ = y + dy[i];
            dfs(x_, y_);
        }


        
    }
}
