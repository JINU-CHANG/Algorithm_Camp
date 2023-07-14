package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_2123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];

        for(int i=0;i<N;i++){
            cards[i]=Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        for(int i=0;i<=N-2;i++){
            int target = M-cards[i]; 
            int max = 0;
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if(cards[j]+cards[k] <=target && cards[j]+cards[k]>max){
                        max = cards[j]+cards[k];
                    }
                }
            }
            if(cards[i]+max>ans){
                ans = cards[i]+max;
            }
        }

        System.out.println(ans);

    }
}
