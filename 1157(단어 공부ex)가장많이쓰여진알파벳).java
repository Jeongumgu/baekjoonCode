import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        
        mostUsedWord(word);
    } // end of main
    
    static void mostUsedWord(String word) {
        int[] arr = new int[26];
        int len = word.length();
        
        for(int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if('a' <= c && c <= 'z') {
                arr[c - 'a']++;
            } else {
                arr[c - 'A']++;
            }
        }
        
        int max = -1;
        char answer = '?';
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer = (char)(i + 65);
            } else if(arr[i] == max) {
                answer = '?';
            }
        }
        
        System.out.println(answer);
    }
}
