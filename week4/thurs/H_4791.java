package week4.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Info implements Comparable<Info> {
    private int b, c, dis;

    public Info(int b, int c) {
        this.b = b;
        this.c = c;
    }

    public int getB() {return this.b;}
    public int getDis() {return this.dis;}
    public int getC() {return this.c;}

    public void setDis(int dis) {
        this.dis = dis;
    };

    @Override
    public int compareTo(Info info) {
        if(this.dis>info.getDis()) return 1;
        if(this.dis == info.getDis()) return 0;
        return -1;
    }


}
public class H_4791 {
    static boolean[] chk;
    static int cnt =0 ;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PriorityQueue<Info> queue = new PriorityQueue<>();
    ArrayList<ArrayList<Info>> edge = new ArrayList<>();

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    chk = new boolean[N+1];

    for(int i=0; i<=N; i++){
        edge.add(new ArrayList<Info>());
    }

    for(int i=0 ; i<M; i++) {
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        edge.get(u).add(new Info(v,c));
        edge.get(v).add(new Info(u,c)); 
    }

    for(int i=0; i<edge.get(1).size(); i++) {
        queue.add(edge.get(1).get(i));
    }

    chk[1] = true;

    while(!queue.isEmpty()) {
        Info f = queue.poll();
        int x = f.getB();
        int c = f.getC();
        int dis = f.getDis();

        if(chk[x]==true) continue;
        if(x==N) break;
        chk[x] = true;
        dis += c;

        for(Info i : edge.get(x)) {
            i.setDis(dis);
            queue.add(i);
        }
    }

    System.out.println(cnt);
}
}
