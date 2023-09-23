import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int T = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            
            int quarters = C / 25;
            C %= 25;

            int dimes = C / 10;
            C %= 10;

            int nickels = C / 5;
            C %= 5;

            int pennies = C;      
             
            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
       
    }
}
