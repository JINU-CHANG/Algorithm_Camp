package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_5302 {
     public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[] array = new int[N];
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                array[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<N; i++){
                int j = 0;
                int sum = 0;
                while(i+j<N && sum<=M){
                    sum += array[i+j];
                    if(sum == M ) cnt++;
                    j++;
                }
            }

            System.out.println(cnt);
    }
}