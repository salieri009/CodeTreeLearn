import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

       int max = Math.max(A, Math.max(B, C));
        int min = Math.min(A, Math.min(B, C));

        System.out.println(A + B + C - max - min);
    }
}