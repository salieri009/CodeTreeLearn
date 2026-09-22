import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int nums = 1;

        while (nums <= N) {
            if (nums % 3 == 0) {
                System.out.print(nums + " ");
            }
            nums++; 
        }

        sc.close();
    }
}
