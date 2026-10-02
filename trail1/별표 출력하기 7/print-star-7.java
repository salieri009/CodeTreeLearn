import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {        // 줄 수 (1부터 n까지)
            for (int j = 1; j <= i; j++) {    // 각 줄에 i개의 별 출력
                System.out.print("* ");
            }
            System.out.println();             // 줄바꿈
        }
    }
}
