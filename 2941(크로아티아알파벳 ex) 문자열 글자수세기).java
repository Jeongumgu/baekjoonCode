import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();
        
        for(String val : alphabet) {
            if(word.contains(val)) {
                word = word.replace(val, "A");
            }
        }
        
        System.out.println(word.length());
    }
}
