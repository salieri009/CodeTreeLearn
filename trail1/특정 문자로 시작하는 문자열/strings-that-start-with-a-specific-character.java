import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 문자열 개수 입력
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        char target = sc.next().charAt(0); 
        int count = 0;
        int totalLength = 0;

        for (int i = 0; i < n; i++) {
            if (words[i].charAt(0) == target) { 
                count++;
                totalLength += words[i].length();
            }
        }

        System.out.print(count +" ");
        if (count > 0) {
            double average = (double) totalLength / count;
            System.out.printf("%.2f\n", average);
        } else {
            System.out.println("0.00"); 
        }
    }
}
