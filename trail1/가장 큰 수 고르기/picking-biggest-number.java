import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int maxVal = 0;

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

            
        }
        System.out.println(maxVal);

    }
}