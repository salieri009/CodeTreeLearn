import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        String word = sc.next();

        int cnt = 0;

        for(int i=0; i<n; i++){

            String givenWord = sc.next();
            if(givenWord.equals(word)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }


}