import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int gcd = 960; // 1920과 2880의 최대공약수

        boolean found = false;
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) { // i가 공약수
                if (i >= A && i <= B) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
