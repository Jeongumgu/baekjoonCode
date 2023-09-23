import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        List<Character> charList = new ArrayList<>();
        
        while(N > 0) {
            if(N % B < 10) {
                charList.add((char) (N % B + '0'));
            } else {
                charList.add((char) (N % B - 10 + 'A'));
            }
            
            N /= B;
        }
        
        for(int i = charList.size() - 1; i >= 0 ; i--) {
            System.out.print(charList.get(i));
        }
    }
}
