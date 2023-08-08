package week5.tues;

import java.io.IOException;
import java.util.Scanner;

public class H_4067 {
    static final int MAX = 10007;
    static int[] memo;
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    memo = new int[N+1];
    
    System.out.println(dp(N));

    sc.close();
}

    public static int dp(int N) {
        if(memo[N]>0) return memo[N];
        if(N==1) return 1;
        if(N==2) return 2;

        memo[N] = (dp(N-1) + dp(N-2)) % MAX;

        return memo[N];


    }
}
