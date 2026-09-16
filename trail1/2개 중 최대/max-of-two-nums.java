import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        int result;

        result = (a > b) ? a : b;
        System.out.println(result);
    }
}