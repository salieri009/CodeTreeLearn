import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            
            boolean match = false;
            if (word.length() >= 3 && word.charAt(2) == c) {
                match = true;
            }
            
            if (word.length() >= 4 && word.charAt(3) == c) {
                match = true;
            }

            if (match) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println(count);
    }
}
