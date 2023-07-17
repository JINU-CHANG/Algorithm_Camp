package week2.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Person {
     int weight;
     int height;
     int k;

    Person(int w, int h){
        this.weight = w;
        this.height = h;
        this.k = 0;
    }
}
public class H_767 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    Person[] persons = new Person[N];
    for(int i=0;i<N;i++){
        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        persons[i] = new Person(w,h);
    }

    for(int i=0; i<N; i++){
        int k = 0;
        for(int j=0; j<N; j++){
            if(i==j) continue;
            if(persons[i].weight<persons[j].weight && persons[i].height<persons[j].height) k++;
        }
        persons[i].k = k+1;
    }

    for(int i=0; i<N; i++) {
        if(i==N-1){
            System.out.print(persons[i].k);
        } else{
            System.out.print(persons[i].k+" ");
        }

    }
    


    }
}
