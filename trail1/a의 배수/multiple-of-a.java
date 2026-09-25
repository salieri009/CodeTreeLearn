import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 범위 끝 값
        int a = sc.nextInt();  // 나눌 값

        int i = 1;             // 시작값
        while (i <= N) {
            if (i % a == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            i++;
        }
    }
}
