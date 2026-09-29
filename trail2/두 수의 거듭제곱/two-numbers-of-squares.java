import java.util.Scanner;

public class Main {

    public static int squareNumber(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 밑
        int b = sc.nextInt(); // 지수

        System.out.println(squareNumber(a, b));
    }
}
