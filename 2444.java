import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            for(int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(int i = 1; i <= N - 1; i++) {
            for(int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            
            for(int k = (N - 1) * 2 ; k >= i * 2 ; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
