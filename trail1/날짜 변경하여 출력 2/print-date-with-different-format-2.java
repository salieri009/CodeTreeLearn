import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String[] str = word.split("-");

        System.out.println(str[2] +"." +str[0] +"."+str[1]);
    }
}