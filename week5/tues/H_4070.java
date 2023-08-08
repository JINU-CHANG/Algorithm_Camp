package week5.tues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_4070 {
    static final int MAX = 1000_000_000 + 7;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    st = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    
    arr = new int[x];
    dp = new int[n+1];

    st = new StringTokenizer(br.readLine());
    for(int i=0; i<x; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
    }

    dp[0] = 1;
    for(int i=1; i<=n; i++){
        for(int j=0; j<x; j++) {
            if(i-arr[j]>=0) dp[i] = ((dp[i]+dp[i-arr[j]]) % MAX);
        }
    }

    System.out.println(dp[n]);
}
}
