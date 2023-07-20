package week2.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class H_121 {
     public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int last = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch(s) {
                case "push" :
                    int n = Integer.parseInt(st.nextToken());
                    last = n;
                    queue.add(n);
                    break;
                case "pop" :
                    if(queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(queue.poll());
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if(queue.isEmpty()) {
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(queue.peek());
                    break; 
                case "back" :
                      if(queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(last);
                    break; 
        }
     }
}
}
