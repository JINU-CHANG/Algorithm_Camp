package week2.tues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_4752 {
    static int N;
    static long[] weights;
    static int[] arr;
    static int[] chk = {1,-1};
    static long sum = 0;
    static long min = 1000000000;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    weights = new long[N];
    arr = new int[N];
    for(int i=0; i<N; i++){
        weights[i] = Long.parseLong(st.nextToken());
    }

    dfs(0);
    System.out.println(min);
}
    public static void dfs(int k){
        if(k==N){
            sum = 0;
            for(int i=0; i<N; i++){
               sum += (arr[i]) * weights[i];
            }
            if(Math.abs(sum) < min) {
                    min = Math.abs(sum);
            }
            return;
        }
        for(int i=0; i<2;i++){
            arr[k] = chk[i];
            dfs(k+1);
        }
    }
}
