package week4.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class H_4152 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    PriorityQueue<Long> queue = new PriorityQueue<>();

    int N = Integer.parseInt(br.readLine());

    for(int i=0; i<N; i++) {
        Long x = Long.parseLong(br.readLine());
        queue.add(x);
    }
    Long time = 0L;
    while(queue.size()>1 && !queue.isEmpty()) {
        Long a = queue.poll();
        Long b = queue.poll();
        time += a+b;
        if(queue.size()>0) queue.add(a+b);
    }

    System.out.println(time);

    }
}
