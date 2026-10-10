import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 삼각형 높이 입력

        for (int i = 1; i <= 2*n - 1; i += 2) {   // 줄 수 (홀수 개수)
            for (int j = 1; j <= i; j++) {       // 해당 줄의 별 개수
                System.out.print("*");
            }
            System.out.println();                // 줄바꿈
        }
    }
}
