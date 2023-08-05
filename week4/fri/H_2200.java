package week4.fri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Reservation implements Comparable<Reservation>{
    int startTime;
    int endTime;

    Reservation(int s, int e) {
        this.startTime = s;
        this.endTime = e;
    }

    @Override
    public int compareTo(Reservation o) {
        if (this.startTime != o.startTime) {
             return Integer.compare(this.startTime, o.startTime);
         } else {
             return Integer.compare(this.endTime, o.endTime);
    }
}
}
public class H_2200 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int N = Integer.parseInt(br.readLine());

    ArrayList<Reservation> arr = new ArrayList<>();

    for(int i=0; i<N; i++) {
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        arr.add(new Reservation(s, e));
    }        
    Collections.sort(arr);
    Reservation cr = arr.get(arr.size()-1);
    int cnt = 1;

    for(int i=N-2; i>=0; i--) {

        Reservation r = arr.get(i);

        if(r.startTime == cr.startTime) {
            if(r.endTime == cr.startTime){
                cr = r;
                cnt ++; 
            }else if((r.endTime - r.startTime) < (cr.endTime - cr.startTime)){
                cr = r;
            }
        }else if(r.startTime < cr.startTime) {
            if(r.endTime == cr.startTime) {
                cr = r;
                cnt ++;
            } else if(r.endTime < cr.startTime) {
                cr = r;
                cnt ++;
            }
        }
    }

    System.out.println(cnt);
    
}

}
