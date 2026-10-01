import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10]; // 이름 통일
        int cnt = 0;               // 짝수 개수
        int sum = 0;               // 짝수 합

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();

            if (array[i] == 0) { // 0 입력 시 종료
                break;
            }

            if (array[i] % 2 == 0) { // 짝수만 카운트 및 합산
                cnt++;
                sum += array[i];
            }
        }

        System.out.print(cnt + " " + sum);
    }
}
