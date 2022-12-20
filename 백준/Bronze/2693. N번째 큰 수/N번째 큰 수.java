import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(br.readLine());
         int[] arrThird = new int[T];

         for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[10];

            for(int j = 0; j < 10; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            arrThird[i] = arr[7];
         }
         for(int i = 0; i < T; i++){
            System.out.println(arrThird[i]);
         }
    }
}