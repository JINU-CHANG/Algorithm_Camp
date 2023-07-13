package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H_4666 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
        	int num =Integer.parseInt(br.readLine());
        	list.add(num);
        }
        
        Collections.sort(list);
        
        for(int i : list) {
        	System.out.println(i);
        }   
    }

}
