import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int midTest = sc.nextInt();
        int finalTest = sc.nextInt();
        int prize = 0 ;

        if(midTest >=90){
            if(finalTest >= 95){
                prize = 100000;
            }else if(finalTest>=90){
                prize = 50000;
            }
        }

        System.out.println(prize);
    }
}