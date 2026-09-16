import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (; input <= 100; input++) {
            System.out.print(input + " ");
        }
    }
}
