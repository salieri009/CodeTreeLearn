import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // 시작 값
        int b = sc.nextInt();  // 종료 기준 값

        int current = a;

        while (current <= b) {
            System.out.print(current + " ");  // 현재 값 출력

            if (current % 2 == 1) {   // 홀수면 2배
                current *= 2;
            } else {                  // 짝수면 +3
                current += 3;
            }
        }
    }
}
