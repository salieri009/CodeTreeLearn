import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int i = 0;

        while (true) {
            if (Math.pow(2, i) == n) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
