import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String word) {
        String reverseword = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseword += word.charAt(i);
        }
        return reverseword.equals(word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (isPalindrome(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
