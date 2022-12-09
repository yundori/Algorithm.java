import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          int maxSum = 0;
          int nowSum =0;
          int N, K;

          for(int i = 0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            nowSum = nowSum + K - N;
            if(maxSum < nowSum){
                maxSum = nowSum;
            }
          }
          System.out.println(maxSum);
    }
}