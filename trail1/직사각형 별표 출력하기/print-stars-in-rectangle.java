import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N, M;
        M = sc.nextInt();
        N = sc.nextInt();

        for(int i = 1; i<=M; i++){
            for(int j = 1; j<=N; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}