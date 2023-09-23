import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int square = 2;
        
        for(int i = 0; i < N; i++) {
            square = (square - 1) + square;
        }

        System.out.println((int) Math.pow(square, 2));
    }
}
