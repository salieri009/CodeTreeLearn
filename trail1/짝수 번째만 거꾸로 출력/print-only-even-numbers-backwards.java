import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next(); // 문자열 입력

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if ((i + 1) % 2 == 0) { // 사람 기준 짝수 번째
                sb.append(word.charAt(i));
            }
        }

        // 역순 출력
        System.out.println(sb.reverse().toString());
    }
}
