import java.util.Scanner;

public class Main {


    public static void printN(int a) {
        if (a == 0) {
            return;
        }
        printN(a - 1); 
        System.out.print(a + " ");
    }

  
    public static void printReverseN(int a) {
        if (a == 0) {
            return;
        }
        System.out.print(a + " ");
        printReverseN(a - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        printN(n);
        System.out.println();

        // 내림차순 출력
        printReverseN(n);
    }
}
