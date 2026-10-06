import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();

        int len1 = word1.length();
        int len2 = word2.length();
        int len3 = word3.length();

        int maxLen = Math.max(len1, Math.max(len2, len3));
        int minLen = Math.min(len1, Math.min(len2, len3));

        System.out.println(maxLen - minLen);
    }
}
