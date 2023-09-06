import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double creditToDouble = 0.0;
        double scoreSum = 0.0;
        double totalSum = 0.0;
        
        for(int i = 0 ; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subNm = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String credit = st.nextToken();
            

            boolean passSub = false;

            switch(credit) {
                case "A+" :
                    creditToDouble = 4.5;
                    break;
                case "A0" :
                    creditToDouble = 4.0;
                    break;
                case "B+" :
                    creditToDouble = 3.5;
                    break;
                case "B0" :
                    creditToDouble = 3.0;
                    break;
                case "C+" :
                    creditToDouble = 2.5;
                    break;
                case "C0" :
                    creditToDouble = 2.0;
                    break;
                case "D+" :
                    creditToDouble = 1.5;
                    break;
                case "D0" :
                    creditToDouble = 1.0;
                    break;
                case "F" :
                    creditToDouble = 0.0;
                    break;
                default :
                    passSub = true;
                    break;
            }

            if(!passSub) {
                scoreSum += score;
                totalSum += score * creditToDouble;
            }

        }
        System.out.printf("%.6f", totalSum / scoreSum);
    }
}
