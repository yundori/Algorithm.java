import java.io.*;
import java.util.*;
public class Main{
    public static int N;
    public static int M;
    public static int V;
    public static int[][] arr;
    public static boolean[] check;
    public static Queue<Integer> q = new LinkedList<>();

    public static void main(String args[]) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
         N = Integer.parseInt(st1.nextToken());
         M = Integer.parseInt(st1.nextToken());
         V = Integer.parseInt(st1.nextToken());

         arr = new int[N+1][N+1];
         check = new boolean[N+1];

         for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            arr[a][b] = arr[b][a] = 1;
         }
         
         dfs(V);
         check = new boolean[N+1];
         System.out.println();
         bfs(V);
         
    }

    public static void dfs(int num){
        check[num] = true;
        System.out.print(num + " ");

        for(int j = 1; j <= N; j++){
            if(arr[num][j] == 1 && !check[j]){
                dfs(j);
            }
        }
    }

    public static void bfs(int num){
        q.add(num);
        check[num] = true;

        while(!q.isEmpty()){
            num = q.poll();
            System.out.print(num + " ");

            for(int i = 1; i <= N; i++){
                if(arr[num][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}