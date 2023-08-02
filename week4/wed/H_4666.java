package week4.wed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_4666 {
    static int N;
    static int[] arr;
    static int[] tmp;
     public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        tmp = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, N-1); 

        for(int i=0; i<N; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int start, int end) {
        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && arr[p]<arr[q])) {
                    tmp[idx++] = arr[p++];
                } else {
                    tmp[idx++] = arr[q++];
                }
            }

            for (int i=start;i<=end;i++) {
                arr[i]=tmp[i];
            }
        }
    }

}
