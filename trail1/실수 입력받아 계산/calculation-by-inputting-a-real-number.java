import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double sum = a + b;

        // 소수점 둘째 자리까지 출력
        System.out.printf("%.2f\n", sum);
    }
}
