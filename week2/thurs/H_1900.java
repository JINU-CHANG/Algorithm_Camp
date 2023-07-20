package week2.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class H_1900 {
      public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=1;i<=N;i++){
            queue.add(i);
        }
        int i=1;
        while(!queue.isEmpty()){
            int x = queue.poll();

            if(i%M!=0) queue.add(x);
            else System.out.print(x+" ");

            i++;
        }
    }
}
