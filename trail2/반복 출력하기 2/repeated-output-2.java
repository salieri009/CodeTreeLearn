import java.util.Scanner;

public class Main {

    public static void SayHelloWorld(int parameter) {
        if (parameter <= 0) {
            return; // 종료 조건
        }
        System.out.println("HelloWorld");
        SayHelloWorld(parameter - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

       SayHelloWorld(n);
    }
}