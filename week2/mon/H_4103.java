package week2.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class H_4103 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    
    //새로운 표지
    String s = br.readLine();
    int len = s.length();
    
    //표지 체크
    int ans = 0;
    for(int i=0; i<N; i++){
        String old = br.readLine();
        int oldLen = old.length();

        loop1 : 
        for(int j=0; j<oldLen; j++){
            //간격체크
            for(int d=0; j+len*d+len<=oldLen ; d++){
                int check  = 0;
                for(int k=0; k<len; k++){
                    if(old.charAt(j+k*d+k)==s.charAt(k)){
                        check ++;
                    }else{
                        break;
                    }
                }

                if(check == len){
                    ans ++;
                    break loop1;
                }
            }
        }
    }

    System.out.println(ans);
}    
}
