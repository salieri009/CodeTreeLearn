import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a 이상에서 가장 작은 c의 배수
        int smallestMultiple = ((a + c - 1) / c) * c;

        if (smallestMultiple <= b) {  // 범위 안에 배수가 있음
            System.out.println("NO");
        } else {
            // 범위 안에 배수가 없음
            System.out.println("YES");
        }
    }
}
