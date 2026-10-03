import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0; // 조건을 만족하는 수의 개수

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a >= 0 && a <= 200) {
                sum += a;
                count++;
            }
        }

        double avg = 0;
        if (count > 0) {
            avg = (double) sum / count;
            avg = Math.round(avg * 10) / 10.0; // 소수 첫째 자리 반올림
        }

        System.out.print(sum + " " + avg);
    }
}
