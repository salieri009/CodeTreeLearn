import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int M = sc.nextInt();

        int cnt = 0;

        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            if( temp == M){
                cnt++;
            }
            
        }

        System.out.println(cnt);
    }
}