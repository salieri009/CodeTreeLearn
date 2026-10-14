import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // 앞에서 두 번째 문자 제거
        String removedFront = word.substring(0, 1) + word.substring(2);

        // 뒤에서 두 번째 문자 제거
        int len = removedFront.length();
        String result = removedFront.substring(0, len - 2) + removedFront.substring(len - 1);

        System.out.println(result);
    }
}
