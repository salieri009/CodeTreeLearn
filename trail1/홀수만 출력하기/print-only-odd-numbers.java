import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 정수 개수 입력

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();  // 각 정수 입력
            if (a % 2 == 1 && a % 3 == 0) { // 홀수이면서 3의 배수
                System.out.println(a);
            }
        }
    }
}
