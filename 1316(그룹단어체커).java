import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            if(groupCheck(word)) {
                cnt++;   
            }
        }
        
        System.out.println(cnt);
    }
    
    static boolean groupCheck(String word) {
        boolean[] chk = new boolean[26];
        int prev = 0;
        
        for(int j = 0; j < word.length(); j++) {
            int now = word.charAt(j);
            if(prev != now) {
                if(chk[now - 'a'] == false) {
                    chk[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    } 
}
