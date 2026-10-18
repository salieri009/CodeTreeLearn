import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String[] starr = word.split("-");

        for(int i=0; i<starr.length; i++){
            System.out.printf(starr[i]);
        }

    }
}