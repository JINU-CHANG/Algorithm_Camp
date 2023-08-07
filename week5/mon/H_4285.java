package week5.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class H_4285 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    HashMap<Integer, Integer> hmap = new HashMap<>();

    int N = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
        int x = Integer.parseInt(st.nextToken());

        if(hmap.containsKey(x)) hmap.replace(x, hmap.get(x)+1);
        else hmap.put(x,1);
    }

    int M = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    for(int i=0; i<M; i++) {
        int x = Integer.parseInt(st.nextToken());

        if(hmap.containsKey(x)) System.out.print(hmap.get(x)+ " ");
        else System.out.print(0+" ");
    }

    }    
}
