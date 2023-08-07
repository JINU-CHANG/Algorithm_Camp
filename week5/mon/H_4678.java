package week5.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class H_4678 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<String> hset = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++) {
            String name = br.readLine();
            hset.add(name);
        }

        int cnt = 0;
        for(int i=0; i<M; i++) {
            String name = br.readLine();
            
            if(hset.contains(name)) cnt ++;
        }

        System.out.println(cnt);
    } 
}
