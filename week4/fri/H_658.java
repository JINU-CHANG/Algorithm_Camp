package week4.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class H_658 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());

    ArrayList<Integer> arr = new ArrayList<>();
    
    
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
        arr.add(Integer.parseInt(st.nextToken()));
    }

    Collections.sort(arr);
    int idx = Math.round( N / (float)2.0);
    System.out.println(arr.get(idx-1));
    }
}
