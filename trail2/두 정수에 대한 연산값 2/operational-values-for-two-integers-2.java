import java.util.Scanner;

public class Main {

    public static int[] answer(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return new int[]{min + 10, max * 2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = answer(a, b);

        if (a < b) {
            a = result[0];
            b = result[1];
        } else {
            a = result[1];
            b = result[0];
        }

        System.out.println(a + " " + b);
    }
}
