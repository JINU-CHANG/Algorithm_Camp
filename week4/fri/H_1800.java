package week4.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class H_1800 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    
    ArrayList<Long> arr = new ArrayList<>();

    for(int i=0; i<N; i++) {
        arr.add(Long.parseLong(br.readLine()));
    }

    Collections.sort(arr);
    
    long max = 0;
    for(int i=0; i<N; i++) {
        max = Math.max(max, arr.get(i)*(N-i));
    }

    System.out.println(max);
    }
}
