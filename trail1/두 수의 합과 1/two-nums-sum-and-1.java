import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        String word = Integer.toString(sum);

        int cnt = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '1') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}