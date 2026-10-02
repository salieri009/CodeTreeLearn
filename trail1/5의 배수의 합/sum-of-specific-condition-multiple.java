import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        // 범위를 올바르게 설정하기 위해 작은 값부터 큰 값까지 반복
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
