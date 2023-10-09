import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int X = Integer.parseInt(st.nextToken());
        int pre_sum = 0; // 현재 대각선 이전까지의 합계
        int cross_count = 1; // 현재 대각선 안의 칸 갯수
        
        while(true) {
            // X 값이 이전 대각선까지의 합계 + 현재 대각선 갯수 보다 작거나 같다면 현재 대각선
            if(X <= pre_sum + cross_count) { 
                if(cross_count % 2 == 1) { // 대각선 갯수가 홀수인 경우 밑에서 위로
                    // 분자는 대각선상 내의 블록 갯수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모는 X번째 - 직전 대각선까지의 블록 갯수
                    System.out.println((cross_count - (X - pre_sum - 1)) + "/" + (X - pre_sum));
                    break;
                } else {
                    //짝수인 경우는 출력을 반대로
                    System.out.println((X - pre_sum) + "/" + (cross_count - (X - pre_sum - 1)));
                    break;
                }
            } else {
                pre_sum = pre_sum + cross_count;
				cross_count++;
            }
        }
    }
}
