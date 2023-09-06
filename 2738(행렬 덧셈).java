import java.util.*;
import java.io.*;

public class Main {
    public static int N, M;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        setArr(br, st, arr);
        setArr(br, st, arr);

        for(int i = 0 ; i < N; i++) {
            for(int j = 0 ; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void setArr(BufferedReader br, StringTokenizer st, int[][] arr) throws IOException {
        for(int i = 0 ; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                arr[i][j] += Integer.parseInt(st.nextToken());
            }
        }       
    }
}
