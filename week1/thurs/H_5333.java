package week1.thurs;

import java.util.Scanner;

public class H_5333 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum1 = 1L;
        long sum2 = 1L;
        for(int i=2; i<N; i++){
            long temp = sum2;
            sum2 = (sum1 + sum2);
            sum1 = temp;
        }

        System.out.println(sum2);
        sc.close();
    }
    
}
