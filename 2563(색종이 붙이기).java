import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        
        boolean[][] rect = new boolean[100][100];
        int total = 0;
        
        for(int i = 0 ; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for(int j = x ; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(!rect[j][k]) {
                        rect[j][k] = true;     
                        total++;
                    }
                }
            }
        }
        System.out.println(total); 
    }
}
