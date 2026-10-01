import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 정사각형 크기 입력

        // 정사각형 두 번 출력
        for (int k = 0; k < 2; k++) {   // 두 개 출력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println(); // 두 정사각형 사이에 빈 줄
        }
    }
}
