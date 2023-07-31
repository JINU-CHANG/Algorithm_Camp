package week4.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class H_4693 {
    static int V;
    static int E;
    static boolean ans = true;
    static ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
    static int[] colored;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    // V, E 입력받기
    st = new StringTokenizer(br.readLine());
    V = Integer.parseInt(st.nextToken());
    E = Integer.parseInt(st.nextToken());


    for(int i=0; i<=V; i++){
        edge.add(new ArrayList<Integer>());
     }
 
    // 그래프 생성
    for(int i=0 ; i<E; i++) {
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        edge.get(u).add(v);
        edge.get(v).add(u); 
    }

    // 1부터 색 칠하기
    // 불가능 여부있으면 NO
    for(int i=0; i<=V; i++){
        colored = new int[V+1];

        dfs(i,2) ;
        
        if(!ans) {
            System.out.println("NO");
            break;
        }

        if(i==V && ans){
            System.out.println("YES");
        }
    }
}   
    public static void dfs(int v, int c) {
        if(colored[v]!=0) {
            if(c!=colored[v]) return;
            else{
                ans = false;
                return;
            }
        }

        if(c == 1) colored[v] = 2;
        else colored[v] =1;

        for(int u: edge.get(v)){
            dfs(u, colored[v]);
        }
}

}