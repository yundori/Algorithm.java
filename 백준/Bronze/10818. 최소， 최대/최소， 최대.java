import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException {
          // BufferedReader 선언
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          // 반복 갯수 선언
          int n = Integer.parseInt(br.readLine());
          // StringTokenizer로 입력 받음 공백기준
          StringTokenizer st = new StringTokenizer(br.readLine(), " ");

          // 배열 변수 선언
          int[] array = new int[n];
          //n만큼 반복
          for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(st.nextToken());
          }

          //sort로 배열 정렬
          Arrays.sort(array);
          System.out.println(array[0] + " " + array[n-1]);
    }
}