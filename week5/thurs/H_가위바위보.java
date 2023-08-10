package week5.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class H_가위바위보 {
    static TreeMap<String, Integer> map = new TreeMap<>();
    static HashMap<String, Integer> hmap = new HashMap<>();
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); //학생수
    int M = Integer.parseInt(st.nextToken()); //대결 수

    hmap.put("rock", -1);
    hmap.put("scissors", 0);
    hmap.put("paper", 1);

    for(int i=0; i<N; i++) {
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        String rsp = st.nextToken();

        map.put(name, hmap.get(rsp));
    }

    for(int i=0; i<M; i++) {
        st = new StringTokenizer(br.readLine());
        game(st.nextToken(), st.nextToken());
    }

    for(String name : map.keySet()) {
        String rsp = "";

        if(map.get(name) == -1) rsp = "rock";
        else if(map.get(name) == 0) rsp = "scissors";
        else rsp = "paper";

        System.out.println(name + " " + rsp);
    }
    }

    public static void game(String n1, String n2) {
        if(map.get(n1) == map.get(n2)) return;

        if(map.get(n1)== -1 && map.get(n2)==0){
            map.replace(n2, 1);
            return;
        } else if(map.get(n1)== -1 && map.get(n2)==1) {
            map.replace(n1, 0);
            return;
        }

        if(map.get(n1) == 0 && map.get(n2) == -1) {
            map.replace(n1, 1);
            return;
        } else if(map.get(n1) == 0 && map.get(n2) == 1){
            map.replace(n2, -1);
            return;
        }

        if(map.get(n1)== 1 && map.get(n2) == 0){
            map.replace(n1, -1);
            return;
        } else if(map.get(n1)== 1 && map.get(n2) == -1){
            map.replace(n2, 0);
            return;
        }
    }
}
