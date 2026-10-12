import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];
        String word = "";

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();   
            word += words[i];     
        }

        System.out.println(word);
    }
}
