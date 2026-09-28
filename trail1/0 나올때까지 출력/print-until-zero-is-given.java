import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            
            if (a == 0) {
                break; // 입력이 0이면 종료
            }
            System.out.println(a);
        }
    }
}
