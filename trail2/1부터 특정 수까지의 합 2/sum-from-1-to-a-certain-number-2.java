import java.util.Scanner;

public class Main {

    public static int sum(int a){

        if(a ==1 ){
            return 1; 
        }

        if (a==2){
            return 3;
        }

        return a + sum(a-1);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(sum(n));
    }
}