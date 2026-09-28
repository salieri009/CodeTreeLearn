import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc =new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            String result = (a>25) ? "Lower" : "Higher";
            if(a ==25){
                System.out.println("Good");
                break;
            }
            System.out.println(result);


        }
    }
}