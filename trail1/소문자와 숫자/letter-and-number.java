import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isDigit(c)) {
                System.out.print(c);
            }
        }
    }
}