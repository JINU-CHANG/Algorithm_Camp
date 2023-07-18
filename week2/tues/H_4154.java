package week2.tues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_4154 {
    static int N;
    static int arr[];
    static int chk[];
    
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    arr = new int[N+1];
    chk = new int[N+1];

    dfs(1);
    
}

    public static void dfs(int k){
        if(k==N+1){
            for(int i=1; i<=N; i++){
                System.out.print((arr[i])+" ");
            }
            System.out.println();
            return;
        }
        for(int i=1; i<=N; i++) {
            if(chk[i]==1) continue;
            arr[k] = i;
            chk[i] = 1;
            dfs(k+1);
            chk[i] = 0;
        }
    }
}
