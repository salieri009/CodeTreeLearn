import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // 온전수가 되려면 아래 조건들을 모두 피해야 함
            if (i % 2 != 0                // 2로 나누어 떨어지지 않는다
                && i % 10 != 5            // 일의 자리 숫자가 5가 아니다
                && !(i % 3 == 0 && i % 9 != 0)) { // 3으로 나누어 떨어지면서 9로는 안 나누어 떨어지는 경우가 아니다
                System.out.print(i + " ");
            }
        }
    }
}
