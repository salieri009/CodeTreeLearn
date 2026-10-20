import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char word = sc.next().charAt(0);

        char prev;
        if(word == 'a') {
            prev = 'z';   // a의 이전은 z
        } else {
            prev = (char)(word - 1); // 그 외는 그냥 -1
        }

        System.out.println(prev);
    }
}
