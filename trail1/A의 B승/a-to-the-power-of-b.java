import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        // Math.pow은 double을 반환하므로 int로 캐스팅
        long result = (long)Math.pow(a, b);

        System.out.println(result);
    }
}
