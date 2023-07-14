package week1.fri;

import java.util.Scanner;

public class H_2951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x=0, y=0, z=0;
        int cnt = 0;

        for(int i=1;i<=N/2;i++){
            x = i;
            int target = N-i;

            for(int j=i;j<=target/2;j++){
                y = j;
                z = target-j;
                
                if(z<x+y){
                    cnt ++;
                }
            }

        }
        System.out.println(cnt);
        sc.close();
    }
}
