import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int x = 0, y = 0;
        int[][] numberLists = new int[9][9];
        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 9; j++) {
                numberLists[i][j] = Integer.parseInt(st.nextToken());
                if(numberLists[i][j] > max) {
                    max = numberLists[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println((x + 1) + " " + (y + 1));
    }
}
