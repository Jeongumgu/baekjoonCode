import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int roomCnt = 0;
        
        // 1 6 12 18 ... 6개씩 증가하는 구조
        
        if(N == 1) {
            roomCnt = 1;
        }
        else {
            N = N - 1;
            while(N > 0) {
                N = N - (roomCnt * 6);
                roomCnt++;
            }
        }
        
        System.out.println(roomCnt);
    }
}
