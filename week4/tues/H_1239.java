package week4.tues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_1239 {
    static int N;
    static int M;
    static int H;
    static int[] trees;
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        trees = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        int l=0;
        int r=1_000_000_000;
        int m=0;
        int answer = 0;

        while(l<=r) {
            long sum=0;

            m = (l+r) / 2;

            for(int i=0; i<N; i++) {
                if(trees[i] - m <0) continue;
                sum += trees[i] - m;
            }

            if(sum >= M) {
                answer = m; //같다면 answer에 m 저장
                l = m+1;
            }
            else r = m-1;
        }

        System.out.println(answer);
	}
    //탐색구간 //답이 있는 구간
}
