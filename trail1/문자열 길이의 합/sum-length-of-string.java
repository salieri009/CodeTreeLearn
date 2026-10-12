import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
         int cnt = 0; 
        int sum =0;
        String a = "a";

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.next();
            sum += arr[i].length();
            
            
            if (arr[i].charAt(0) == 'a') {
                cnt++;
            }


        }

        System.out.print(sum+" ");
        System.out.print(cnt+" ");

       
    }
}