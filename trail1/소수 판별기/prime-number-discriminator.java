import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean isPrime = true;

        if (N <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
    }
}