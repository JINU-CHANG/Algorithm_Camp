package week1.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_556 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        Loop :
        for(int i=0; C*i<=num; i++){
            int target = num-(C*i);
            for(int j=0; B*j<=target; j++){
                if((target - j*B) % A ==0) {
                    System.out.println(1);
                    break Loop;
                }
            }

            if(num%C==0){
                System.out.println(1);
                break;
            }

            if(i==C*i){
                System.out.println(0);
            }
        }
        
    }
}