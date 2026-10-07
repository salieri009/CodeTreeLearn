import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt(); 
        int e = sc.nextInt();

        // a와 b 비교
        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // a와 c 비교
        if (a > c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // a와 d 비교
        if (a > d) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // a와 e 비교
        if (a > e) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
