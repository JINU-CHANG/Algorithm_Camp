package week4.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class H_2709 {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int N = Integer.parseInt(br.readLine());

    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();

    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
        A.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) {
        B.add(-Integer.parseInt(st.nextToken()));
    }

    Collections.sort(A);
    Collections.sort(B);

    long max = 0;
    for(int i=0; i<N; i++) {
        max += ((long)A.get(i) * -B.get(i));
    }

    System.out.println(max);
}
}
