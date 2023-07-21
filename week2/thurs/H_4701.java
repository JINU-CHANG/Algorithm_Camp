package week2.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class H_4701 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        queue.offer(A);

        while(!queue.isEmpty()){
            //천의 자리 변환
            for(int i=1; i<10; i++){
                int temp = i * 1000 + (A%1000);
            }

            //백의 자리 변환

            //십의 자리 변환

            //일의 자리 변환
        }
        
    }
}
