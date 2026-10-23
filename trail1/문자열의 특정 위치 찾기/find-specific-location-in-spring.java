import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char character = sc.next().charAt(0);

        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("No");
        } else {
            System.out.println(index);
        }
    }
}