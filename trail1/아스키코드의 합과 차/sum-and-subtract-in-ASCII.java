import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String word2 = sc.next(); 

        // 문자열의 첫 번째 문자(char)를 꺼내서 ASCII 값으로 변환
        int ascii = (int) word.charAt(0);
        int ascii2 = (int) word2.charAt(0);

        System.out.print(ascii + ascii2 + " ");
        System.out.print(Math.abs(ascii - ascii2));
    }
}
