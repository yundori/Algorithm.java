import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          int nowSum = 0;
          int[] array = new int[9];

          for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            array[i] = Integer.parseInt(st.nextToken());
            nowSum += array[i];
          }
          
          for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9; j++){
                if(nowSum - array[i] - array[j] == 100){
                    array[i] = 0;
                    array[j] = 0;
                    Arrays.sort(array);
                    for(int k = 2; k < 9; k++){
                        System.out.println(array[k]);
                    }
                    return;
                }
            }
          }

    }
}