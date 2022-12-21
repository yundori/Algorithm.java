import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         int totalNum = sum(B) - sum(A-1);

         System.out.println(totalNum);
    }
    static int sum(int N){
        int total = 0;
        int S = 1;
        int T = 1;

        for(int i = 1; i <= N; i++){
            if(T == 0){
                S++;
                T = S;
            }
            total += S;
            T--;
        }
        return total;
    }
}