package week1.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_5334 {
    public static void main(String[] args) throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    long c = Long.parseLong(st.nextToken());
    long d = Long.parseLong(st.nextToken());
    long result1 = gdc(a,b);
    long result2 = gdc(c,d);
    a = a/result1;
    b = b/result1;

    c = c/result2;
    d = d/result2;

    if(a*d == c*b){
        System.out.println("EQUALS");
    }else if(a*d > c*b) {
        System.out.println("A/B");
    }else {
        System.out.println("C/D");
    }
}

    public static long gdc(long a, long b){ //최대공약수
        if(a<b)
        {
            long temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
