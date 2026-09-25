import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        while (true) {
            if (N == 1){
                break;
            }
            if (N % 2 == 0) {
                N = N / 2;
                count++;
            } else {
                N = 3 * N + 1;
                count++;
            }

            if (N == 1) {
                break;
            }
        }

        System.out.println(count);
    }
}
