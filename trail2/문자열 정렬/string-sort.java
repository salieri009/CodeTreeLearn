import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.''

        char[] cahrs = s.toCharArray();
        Arrays.sort(cahrs);
        String sortedStr = new String(cahrs);

        System.out.println(cahrs);
    }
}