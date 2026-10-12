import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        String word = a.concat(b);
        String word2 = b.concat(a);

        if(word.equals(word2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}