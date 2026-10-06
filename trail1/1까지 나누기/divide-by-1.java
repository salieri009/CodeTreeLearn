import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 1;
        int cnt = 0;

        while (N > 1) {
            N = N / i;   // N을 갱신해야 함
            cnt++;
            i++;
        }

        System.out.println(cnt);
    }
}
