import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        boolean allMultiplesOfThree = true;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 3 != 0) {
                allMultiplesOfThree = false;
            }
        }


        if (allMultiplesOfThree) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        
    }
}