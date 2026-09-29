import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ft = sc.nextDouble(); // 피트 입력
        double cm = ft * 30.48;      // cm로 변환

        System.out.printf("%.1f\n", cm);
    }
}
