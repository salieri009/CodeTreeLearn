import java.util.Scanner;

public class Main {

    // 온전수인지 판별하는 함수
    public static boolean isOnjeonsu(int n) {
        if (n % 2 == 0) return false; // 2로 나누어 떨어짐
        if (n % 10 == 5) return false; // 일의 자리가 5
        if (n % 3 == 0 && n % 9 != 0) return false; // 3으로는 나누어 떨어지지만 9로는 아님
        return true; // 위 조건에 모두 해당하지 않으면 온전수
    }

    // A 이상 B 이하 온전수 개수 세기
    public static int howMany(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (isOnjeonsu(i)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(howMany(a, b));
    }
}
