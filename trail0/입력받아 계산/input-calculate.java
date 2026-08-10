import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 정수 입력 받기
        int a = sc.nextInt();

        // a + 2 출력
        System.out.println(a + 2);

        sc.close();
    }
}
