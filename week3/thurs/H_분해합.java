package week3.thurs;

import java.io.IOException;
import java.util.Scanner;

public class H_분해합 {
    static int N;
    static int M;
    static int y;
    static int ans = -1;
    static int[] arr = {1000_000,100_000,10_000,1000,100,10,1};
    public static void main(String[] args) throws IOException {
    
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();

    loop :
    for(int i=1; i<=1000000; i++){
        int sum = 0;
        M = i;
        y = M;

        for(int j=0; j<arr.length; j++){
            sum += y/arr[j];
            y = y%arr[j];
    }
        if(M + sum == N){
            ans = M;
            break loop;
        }
    }

    if(ans<0) {
        System.out.println(0);
    }else{
         System.out.println(ans);
    }
    sc.close();
}
}
