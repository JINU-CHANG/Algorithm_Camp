package week4.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class H_4313 {
    static int N; //학생 수 
    static int M; //비교 횟수
    static boolean[] chk;
    static int cnt;
    static int ans;
    static ArrayList<ArrayList<Integer>> tall = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> small = new ArrayList<>();

    static int[] tallArr;
    static int[] smallArr;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
        
    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    for(int i=0; i<=N; i++){
       tall.add(new ArrayList<Integer>());
       small.add(new ArrayList<Integer>());
    }

    for(int i=0; i<M; i++) {
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        tall.get(u).add(v);
        small.get(v).add(u);
    }
    
    tallArr = new int[N+1];
    smallArr = new int[N+1];

    for(int i=0; i<=N; i++) {
        chk = new boolean[N+1];
        cnt = 0;
        tallArr[i] = dfs(tall, i);
        chk = new boolean[N+1];
        cnt = 0;
        smallArr[i] = dfs(small, i);
    }
    
    for(int i=0; i<=N; i++) {
        if(tallArr[i]+smallArr[i] == N+1) {
            ans ++;
        }
    }

    System.out.println(ans);
}
    public static int  dfs(ArrayList<ArrayList<Integer>> arr, int v) {
        if(chk[v]) return 0;
        chk[v] = true;

        cnt +=1;
        for(int u: arr.get(v)){
            dfs(arr, u);
        }
        return cnt;
    }


}
