import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        char next;
        if (alphabet == 'z') {
            next = 'a';   
        } else {
            next = (char)(alphabet + 1); 
        }

        System.out.println(next);
    }
}
