import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        
        palindrome(word);
    } // end of main
    
    static void palindrome(String word) {
        int len = word.length();

        for(int i = 0; i < len / 2; i++) {
            char front = word.charAt(i);
            char back = word.charAt((len - 1) - i);
            
            if(front != back) {
                System.out.println(0);
                return;
            } 
        }
        
        System.out.println(1);
    }  // end of palindrom
}
