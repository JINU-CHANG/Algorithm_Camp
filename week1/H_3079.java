package week1;

import java.util.Scanner;

public class H_3079 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); //주어진 자연수가 int 형을 넘어가므로 long으로 변환
        long sum = 0L;
        
        for(long i=1L; i*i<=n; i++) { //루트 n 만큼 for문 반복
        	if(n%i==0) {
        		if(i==n/i) {
        			sum += i;
        		}else {
        			sum += i+(n/i);
        		}
        	}
        }
        
        System.out.println(sum);
        sc.close();
    }

}