package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class H_4677 {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<Integer> hset = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            hset.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(hset.size());
    }
}
