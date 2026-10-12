import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (counter < 3) {
            int a = sc.nextInt();

            if (a % 2 == 0) { // 짝수일 때만 처리
                System.out.println(a / 2);
                counter++;
            }
            // 홀수면 아무 작업도 하지 않고 다시 입력 받음
        }
    }
}
