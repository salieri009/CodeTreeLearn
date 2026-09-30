import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 원소 개수 입력
        int[] arr = new int[N];

        // N개의 원소 입력
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 각 원소 제곱하여 출력
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] * arr[i]+" ");
        }
    }
}
