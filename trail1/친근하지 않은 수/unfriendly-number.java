import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;
        
        for(int i = 1; i <= N; i++) {
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue; // 2, 3, 5의 배수는 건너뛰기
            } else {
                result += 1; // 조건을 만족하는 수 개수 세기
            }
        }

        System.out.println(result); // 최종 결과 출력
    }
}
