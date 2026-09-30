import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[10];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextInt();

            if (list[i] >= 250) {
                break;  
            }

            sum += list[i];
            count++;
        }

        double avg = (count > 0) ? (double) sum / count : 0;

        System.out.println(sum + " " + String.format("%.1f", avg));
    }
}
