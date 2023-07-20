package week2.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class H_101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<Integer>();

        while(true){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.equals("end")) break;

            switch(s) {
                case "push" :
                    int n = Integer.parseInt(st.nextToken());
                    System.out.println(stack.push(n));
                    break;
                case "pop" : 
                    if(stack.empty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.pop());
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if(stack.empty()) {
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "top" :
                    if(stack.empty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.peek());
                    break;
            }
        }
        

    }
}
