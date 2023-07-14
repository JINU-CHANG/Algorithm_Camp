package week1.thurs;

import java.math.BigInteger;
import java.util.Scanner;

public class H_Fibo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger sum1 = new BigInteger("1");
        BigInteger sum2 = new BigInteger("1");
        for(int i=2; i<N; i++){
            BigInteger temp = sum2;
            sum2 = (sum1.add(sum2));
            sum1 = temp;
        }
        BigInteger x = new BigInteger("1000000007");
        System.out.println(sum2.remainder(x));

        sc.close();
    }
}
