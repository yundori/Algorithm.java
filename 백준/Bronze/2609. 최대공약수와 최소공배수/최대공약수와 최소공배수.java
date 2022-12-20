import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         int CDGYS = 1;
         int CDGBS = 1;

         for(int i = N; i >= 1; i--){
            if(N % i == 0){
                if(K % i == 0){
                    CDGYS = i;
                    break;
                }
            }
         }
         
         CDGBS = CDGYS * (N / CDGYS) * (K / CDGYS);
         System.out.println(CDGYS);
         System.out.println(CDGBS);
    }
}