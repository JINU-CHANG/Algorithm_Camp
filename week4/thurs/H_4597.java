package week4.thurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_4597 {
    static int N;
    static long[] tree;
    static int size;
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());

    tree = new long[N+1];

    for(int i=0; i<N; i++){
        int x = Integer.parseInt(br.readLine());

        if(x>0) add(x);
        else if(x==0) System.out.println(remove());
    }

    }

    public static void add(long x) {
        tree[++size] = x;

        int idx = size;

        while(idx>1) {
            if(tree[idx] < tree[idx/2]) swap(idx, idx/2);
            else break;
            idx /=2;
        }
    }

    public static void swap(int x, int y) {
        long tmp = tree[y];
        tree[y] = tree[x];
        tree[x] = tmp;
    }

    public static long remove(){
        if(size==0) return 0;

        long top = tree[1]; //맨 위의 값

        tree[1] = tree[size];
        tree[size--] = 0;

        int idx = 1;

        while(idx*2 <= size) {
            int l = idx*2; int r = idx*2+1;

            if(tree[l]<tree[idx] && (tree[l] < tree[r] || r >size)) { //r > size : 값이 존재하지 않는다.
                swap(l, idx);
                idx = l;
            } else if( r<=size && tree[r]<tree[idx]) {
                swap(r,idx);
                idx = r;
            } else break;
        }

        return top;
    }
}
