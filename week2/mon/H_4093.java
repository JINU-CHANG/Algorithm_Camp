package week2.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_4093 {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int N = Integer.parseInt(br.readLine());

    int[] array = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++){
        array[i] = Integer.parseInt(st.nextToken());
    }

    int ans = 0;

    for(int i=0; i<N; i++){
        for(int j=i; j<N; j++){
             int sum = 0;
            for(int k=i; k<=j; k++){
                sum += array[k];
            }

            for(int k=i; k<=j; k++){
               if(sum == array[k]*(j-i+1)){
                    ans ++;
                    break;
               }
            }
        }
    }

    System.out.println(ans);
        
}
}
