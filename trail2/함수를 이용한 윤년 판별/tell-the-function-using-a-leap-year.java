import java.util.Scanner;

public class Main {

    public static boolean isYoon(int y) {
        // 윤년 판별 공식
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.

        System.out.print(isYoon(y));
    }
}