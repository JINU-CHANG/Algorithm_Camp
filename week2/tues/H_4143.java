package week2.tues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_4143 {
    static int M;
    static int N;
    static int[] arr;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    
    arr = new int[M+1];
    
    dfs(1,0);
}
    public static void dfs(int k, int j){
        if(k==M+1){
            for(int i=1;i<M+1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        
        for(int i=j+1; i<N+1; i++){
            arr[k] = i;
            dfs(k+1,i);
        }
    }
}
