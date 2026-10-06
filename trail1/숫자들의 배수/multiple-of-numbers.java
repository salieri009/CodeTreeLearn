import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   // 1 이상 10 이하의 정수 입력
        int cnt = 0;            // 5의 배수 등장 횟수
        int[] arr = new int[1000]; // 충분히 큰 배열 준비

        int idx = 0;
        int multiple = a;

        while (true) {
            arr[idx] = multiple;   // 배열에 저장
            System.out.print(arr[idx]+" "); // 출력
            idx++;

            if (multiple % 5 == 0) { // 5의 배수인지 확인
                cnt++;
                if (cnt == 2) break; // 두 번째 등장 시 종료
            }

            multiple += a; // 다음 배수로 갱신
        }
    }
}
