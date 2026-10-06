import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; // 최대 10개 저장
        int count = 0;           // 실제 입력된 개수 추적

        // 입력 받기
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                break;           // 0 입력 시 종료
            }
            arr[count++] = a;    // 배열에 저장 후 개수 증가
        }

        // 역순 출력
        for (int j = count - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
