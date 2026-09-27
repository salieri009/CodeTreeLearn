import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 첫 줄: 정수 개수
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt(); // 하나씩 입력받기
            if (num % 2 == 1 && num % 3 == 0) { // 홀수이면서 3의 배수
                sum += num;
            }
        }

        System.out.println(sum); // 결과 출력
    }
}
