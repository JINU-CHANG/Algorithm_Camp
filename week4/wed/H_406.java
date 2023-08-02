package week4.wed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class H_406 {
    static int n;
    static int[] arr;
    public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        printArr();

        for(int i=n-1; i>=0; i--) {
            for(int j=0; j<=i ; j++){
                if(j+1>i) break;
                if(arr[j]-arr[j+1]>0) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                    printArr();
                }
            }
        }
    }

    static void printArr() {
        for(int k=0; k<n; k++) {
            System.out.print(arr[k]+" ");
        }
            System.out.println();
    }
}
