import java.util.Scanner;

public class Main {

    public static long getNumber(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        long num1 = getNumber(word1);
        long num2 = getNumber(word2);

        System.out.println(num1 + num2);
    }
}