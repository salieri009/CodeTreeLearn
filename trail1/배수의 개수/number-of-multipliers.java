import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int threeCnt = 0;
        int fiveCnt = 0;

        // 10개의 수 입력
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num % 3 == 0) {
                threeCnt++;
            }
            if (num % 5 == 0) {
                fiveCnt++;
            }
        }

        System.out.print(threeCnt + " " + fiveCnt);
    }
}
