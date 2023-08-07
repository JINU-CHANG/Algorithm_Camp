package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class H_4679 {
    static TreeSet<String> tset = new TreeSet<>();
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    
    for(int i=0; i<N; i++) {
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        if(tset.contains(name)) tset.remove(name);
        else tset.add(name);
    }

    System.out.println(tset.size());
    
    for(String name: tset) {
        System.out.println(name);
    }

    }
}
