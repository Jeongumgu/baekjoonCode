/**
 * 3003번 킹, 퀸, 룩, 비숍, 나이트, 폰
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] chess = {1, 1, 2, 2, 2, 8};

        for(int i = 0 ; i < chess.length; i++) {
            int cnt = Integer.parseInt(st.nextToken());
            System.out.print(chess[i] - cnt);

            if(i != chess.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
