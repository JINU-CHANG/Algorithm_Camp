package week1;

import java.util.Scanner;

public class H_2188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int x=0, y=0;

        for(int i=0; 5*i<=N;i++){
            if((N-(5*i))%3==0){
                x=(N-(5*i))/3;
                y=i;
            }
        }

        if(x==0 && y==0){
            System.out.println(-1);
        }else{
            System.out.println(x+y);
        }
        
        sc.close();
    }
}
