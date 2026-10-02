import java.util.Scanner;

public class Main {

    public static boolean isItEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(isItEven(arr[i])){
                arr[i] = arr[i]/2;
                
            }

            System.out.print(arr[i]+" ");
        }
        // Please write your code here.
    }
}