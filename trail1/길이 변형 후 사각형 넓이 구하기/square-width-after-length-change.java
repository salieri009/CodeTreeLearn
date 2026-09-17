import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int row;
        int column;

        Scanner sc = new Scanner(System.in);

        row = sc.nextInt();
        column = sc.nextInt();

        row = row + 8;
        column = column *3 ;

        System.out.println(row);
        System.out.println(column);

        System.out.println(row*column);


    }
}