import java.util.Scanner;

public class Main {

    // a와 b를 수정하는 함수
    public static void modifyValues(int[] nums) {
        if (nums[0] > nums[1]) {
            nums[0] += 25;   // 큰 수에 25 더하기
            nums[1] *= 2;    // 작은 수에 2 곱하기
        } else {
            nums[1] += 25;
            nums[0] *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 배열로 전달 (Java는 기본형은 값 복사라 직접 수정 불가 → 참조형 사용)
        int[] nums = {a, b};

        modifyValues(nums);   // 함수 호출로 값 수정

        // 함수 호출 이후에 출력
        System.out.println(nums[0] + " " + nums[1]);
    }
}
