import java.util.Scanner;

public class Main {

    public static int absolute(int a){
        return Math.abs(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            
            arr[i] = absolute(sc.nextInt());
            System.out.print(arr[i]+" ");
        }
        // Please write your code here.

       
    }
}