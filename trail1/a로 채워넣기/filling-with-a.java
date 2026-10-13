import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // StringBuilder로 변환
        StringBuilder sb = new StringBuilder(word);

        // 앞에서 두 번째 문자 (index 1)
        if (sb.length() >= 2) {
            sb.setCharAt(1, 'a');
        }

        // 뒤에서 두 번째 문자 (index length-2)
        if (sb.length() >= 2) {
            sb.setCharAt(sb.length() - 2, 'a');
        }

        System.out.println(sb.toString());
    }
}
