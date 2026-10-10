import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] array = new int[1000];
        int i = 0;

        while (true) {
            array[i] = sc.nextInt();
            if(array[i]==0){
                break;
            }
            i++;
        }

        int sum = array[i-3] +array[i-2] + array[i-1];
        System.out.println(sum);


        
    }
}