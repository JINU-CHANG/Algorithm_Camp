package week3.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class H_4321 {
    static int N; //정점
    static int M; //간선 개수
    static int V; //정점 번호
    static boolean[] chk;
    static ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    V = Integer.parseInt(st.nextToken());

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

    for(int i=0; i<=N; i++){
        Collections.sort(edge.get(i));
    }

    chk = new boolean[N+1];
    dfs(V);

    System.out.println();

    chk = new boolean[N+1];
    bfs(V);

}
    public static void dfs(int v){
        if(chk[v]) return;
        chk[v] = true;
        System.out.print(v + " ");

        for(int u: edge.get(v)){
            dfs(u);
        }
    
    }

    public static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);

        while(!queue.isEmpty()) {
            int x = queue.poll();

            if(chk[x]) continue;
            chk[x] = true;
            System.out.print(x + " ");

            for(int u: edge.get(x)){
                queue.offer(u);
            }



        }
        


    }

}
