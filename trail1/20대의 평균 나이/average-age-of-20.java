import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;   // 나이 합계
        int count = 0; // 입력된 사람 수

        while (true) {
            int age = sc.nextInt();

            // 20대인지 확인
            if (age >= 20 && age <= 29) {
                sum += age;
                count++;
            } else {
                
                break;
            }
        }

        
        double avg = (double) sum / count;
        System.out.printf("%.2f", avg);
    }
}
