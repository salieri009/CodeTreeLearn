import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String word = Integer.toString(n);

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            sum += word.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}