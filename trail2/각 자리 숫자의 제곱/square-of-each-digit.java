import java.util.Scanner;

public class Main {

    public static int fun(int n) {
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;
        return digit * digit + fun(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fun(n));
    }
}