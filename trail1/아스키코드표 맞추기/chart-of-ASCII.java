import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5개의 숫자 입력
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        // 아스키 문자로 변환하여 출력
        for (int i = 0; i < 5; i++) {
            System.out.print((char) nums[i] + " ");
        }
    }
}
