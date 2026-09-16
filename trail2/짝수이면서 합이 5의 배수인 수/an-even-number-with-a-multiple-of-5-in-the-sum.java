import java.util.Scanner;

public class Main {


    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 자리수 합 함수
    public static int digitSum(int num) {
        int tens = num / 10;   
        int ones = num % 10;   
        return tens + ones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 조건: 짝수 && 자리수 합이 5의 배수
        if (isEven(n) && digitSum(n) % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
