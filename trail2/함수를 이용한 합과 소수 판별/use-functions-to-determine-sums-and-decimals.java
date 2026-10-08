import java.util.Scanner;

public class Main {

    // 소수 판별
    public static boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 짝수 판별
    public static boolean isEven(int b) {
        return b % 2 == 0;
    }

    // 자릿수 합 구하기
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;

        for (int i = A; i <= B; i++) {
            if (isPrime(i) && isEven(digitSum(i))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
