package week3.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class H_877 {
    static int N; //컴퓨터 수
    static int M; //쌍
    static ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
    static boolean[] chk;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());
    M = Integer.parseInt(br.readLine());

    for(int i=0; i<=N; i++){
        edge.add(new ArrayList<Integer>());
    }
    
    while(M-- > 0){
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        edge.get(u).add(v);
        edge.get(v).add(u);
    }

    chk = new boolean[N+1];

    dfs(1);
    System.out.println(cnt-1); // 자신제외
    }

    public static void dfs(int v){

        if(chk[v]) return;
        chk[v] = true;
        cnt ++;

        for(int u: edge.get(v)){
            dfs(u);
        }


    }
}
