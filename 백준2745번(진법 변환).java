import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int parseNum = 0;
        int sum = 0;
                                 
        for(int i = 0; i < N.length(); i++) {
            char temp = N.charAt(i);
            
            if(temp >= '0' && temp <= '9') {
                parseNum = temp - '0'; // 숫자는 '0' 을 빼주어 숫자로 변환
            } else {
                parseNum = temp - 55; // 숫자가 아닌경우는 'A' 가 65이기 때문에 55를 빼주어 10~.. 변환
            }
            
            sum += Math.pow(B, N.length() - 1 - i) * parseNum;
        }
        
        System.out.println(sum);
    }
}
