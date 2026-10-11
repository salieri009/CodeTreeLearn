import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int result = 0; 
        
        for(int i=0; i<10; i++){
            arr[i] =sc.nextInt();
            if (arr[i] % 3 == 0){
                result = arr[i-1];
                break;
            }
        }
        System.out.println(result);
    }
}