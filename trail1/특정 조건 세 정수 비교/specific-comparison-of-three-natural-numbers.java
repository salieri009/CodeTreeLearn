import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 세 수 중 최솟값 구하기
        int min = Math.min(a, Math.min(b, c));

        // 첫 번째 수가 최솟값과 같은지 확인
        if (a == min) {
            System.out.print(1 + " ");
        } else {
            System.out.print(0+ " ");
        }

        // 세 수가 모두 같은지 확인
        if (a == b && b == c) {
            System.out.println(1+ " ");
        } else {
            System.out.println(0 + " ");
        }
    }
}
