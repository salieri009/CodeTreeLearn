import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || contains369(i)) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    // 숫자에 3,6,9가 포함되어 있는지 확인
    public static boolean contains369(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
