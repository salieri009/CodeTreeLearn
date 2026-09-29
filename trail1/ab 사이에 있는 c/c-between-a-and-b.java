import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            if (i % c == 0) {   // c의 배수인지 확인
                satisfied = true;
                break;          // 하나라도 찾으면 더 볼 필요 없음
            }
        }

        if (satisfied) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
