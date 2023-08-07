package week5.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class H_4680 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    TreeMap<String, Integer> tmap = new TreeMap<>();

    int N = Integer.parseInt(br.readLine());

    for(int i=0; i<N; i++) {
        String book = br.readLine();
        if(tmap.containsKey(book)) tmap.replace(book, tmap.get(book) + 1);
        else tmap.put(book,0);
    }

    int max = 0;
    String ans = tmap.firstKey();

    for(String book : tmap.keySet()) {
        if(max < tmap.get(book)){
            max = tmap.get(book);
            ans = book;
        }
    }

    System.out.println(ans);
    } 
}
