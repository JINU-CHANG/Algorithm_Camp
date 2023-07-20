package week2.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class H_4697 {
      public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int[] dist = new int[200001];

        queue.add(X);
        queue.add(1);
        while(!queue.isEmpty()){
            int x = queue.poll();
            int d = queue.poll();

            if(x<0 || x>200000 || dist[x]>0) continue;

            if(x==Y) {
                 System.out.println(d-1);
                 break;
            }
            dist[x] = d;

            queue.add(x-1); queue.add(d+1);
            queue.add(x+1); queue.add(d+1);
            queue.add(2*x); queue.add(d+1);
        }
    }
}
