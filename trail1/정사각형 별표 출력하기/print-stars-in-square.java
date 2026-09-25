import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // N행 N열의 정사각형 출력
        for (int i = 0; i < N; i++) {        
            for (int j = 0; j < N; j++) {    // 열 반복
                System.out.print("*");
            }
            System.out.println();            // 줄바꿈
        }
    }
}
