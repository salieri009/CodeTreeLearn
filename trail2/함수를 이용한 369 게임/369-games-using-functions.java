import java.util.Scanner;

public class Main {

    // 특정 수가 조건(3의 배수 또는 숫자에 3,6,9 포함)을 만족하는지 검사하는 함수
    public static boolean checkNumber(int num) {
        // 3의 배수인지 확인
        if (num % 3 == 0) {
            return true;
        }
        // 숫자에 3,6,9가 포함되어 있는지 확인
        String s = String.valueOf(num);
        for (char c : s.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;
        for (int i = A; i <= B; i++) {
            if (checkNumber(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
