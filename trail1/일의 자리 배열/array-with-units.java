import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 첫 번째 항
        int b = sc.nextInt(); // 두 번째 항

        int[] ary = new int[10]; // 10개의 항 저장

        ary[0] = a;
        ary[1] = b;

        // 세 번째 항부터 계산
        for (int i = 2; i < 10; i++) {
            ary[i] = (ary[i - 2] + ary[i - 1]) % 10;
        }

        // 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(ary[i] + " ");
        }
    }
}
