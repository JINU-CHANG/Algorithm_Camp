package week3.thurs;

import java.io.IOException;
import java.util.Scanner;

public class H_랜덤만들기 {
    static int N;
    static int cnt;
    static int[] chk;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        chk = new int[99*99];
        int x = N;
        cnt = 0;
        
        while(true){

            String s = String.valueOf(x);
            int temp;
            if(x>=1000){
                temp = (s.charAt(1) - '0')*10 + (s.charAt(2) - '0') ;
            } else if(x>=100){
                temp = (s.charAt(0) - '0')*10 + (s.charAt(1) - '0') ;
            } else if(x>=10) {
                temp = (s.charAt(0) - '0');
            } else{
                temp = 0;
            }
            x = temp*temp;
            if(chk[x]==1) {
                cnt ++;
                break;
            }
            chk[x] = 1;
            cnt ++;
        }

        System.out.println(cnt);
        sc.close();
    }
}
