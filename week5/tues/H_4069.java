package week5.tues;

import java.io.IOException;
import java.util.Scanner;

public class H_4069 {
    static int[] memo = new int[12];
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int T = sc.nextInt();

    memo[1] = 1;
    memo[2] = 2;
    memo[3] = 4;
    for(int i=4; i<=11; i++){
        dp(i);
    }

    for(int i=0; i<T; i++) {
        int N = sc.nextInt();
        System.out.println(memo[N]);
    }

    sc.close();

    }

    public static int dp(int N) {
        if(memo[N]>0) return memo[N];
        if(N==1) return 1;
        if(N==2) return 2;
        if(N==3) return 4;

        memo[N] = (dp(N-1) + dp(N-2) + dp(N-3));

        return memo[N];
    }
}
