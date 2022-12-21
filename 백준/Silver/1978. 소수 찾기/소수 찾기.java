import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(br.readLine());
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int totalNum = 0;
         int N = 0;

         for(int i = 0; i < T; i++){
            N = Integer.parseInt(st.nextToken());
            int K = 0;

            if(N != 1){
                for(int j = 1; j <= N; j++){
                    if(N % j == 0){
                        K++;
                    }
                }
                if(K <= 2){
                    totalNum++;
                }
            }
         }
         System.out.println(totalNum);
    }
}