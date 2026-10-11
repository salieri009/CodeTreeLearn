import java.util.Scanner;
public class Main {

    public static void printStairs(int n) {
        if (n == 0) return; // 종료 조건

        // 먼저 위쪽 줄들을 재귀적으로 출력
        printStairs(n - 1);

        // 현재 줄에 n개의 별 출력
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printStairs(n);
    }
}