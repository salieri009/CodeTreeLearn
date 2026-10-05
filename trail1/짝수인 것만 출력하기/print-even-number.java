import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 원소 개수 입력
        int[] arr = new int[n];

        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 짝수만 저장할 리스트
        ArrayList<Integer> evenArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr.add(arr[i]);
            }
        }

        // 출력
        for (int num : evenArr) {
            System.out.print(num + " ");
        }
    }
}
