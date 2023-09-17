import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int maxColLen = 0;
        char[][] charArr = new char[5][15];
        
        for(int i = 0; i < 5; i++) {
            String row = br.readLine();
            maxColLen = Math.max(maxColLen, row.length());
            for(int j = 0; j < row.length(); j++) {
                charArr[i][j] = row.charAt(j);
            }
        }
        
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(charArr[j][i] != '\0') {
                    System.out.print(charArr[j][i]);    
                }
            }
        }
    }
}
