package week5.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_젠가 {
    static int[] zenga;
    static int N;
    static int cnt;
    static int last;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    N = Integer.parseInt(br.readLine());
    last = N-1;
    
    zenga = new int[N];

    st = new StringTokenizer(br.readLine());

    for(int i=0; i<N; i++) {
        int x = Integer.parseInt(st.nextToken());
        zenga[i] = x;
    }

    for(int i=1; i<=N-1; i++) {
        int idx1 = chk(i);
        int idx2 = chk(i+1);
        if(idx1 < idx2) continue;
        else if(idx1> idx2) {
            last = last +1;
            zenga[idx2] = 0; 
            cnt ++;
        }
    }

    System.out.println(cnt);
}
    public static int chk(int n) {
        for(int i=0; i<N; i++) {
            if(zenga[i] == n) return i;
        }

        return last;
    }
}
