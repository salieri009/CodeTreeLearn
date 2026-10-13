import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();

        if(word.contains("ee")){
            System.out.print("Yes" + " ");
        }else{
            System.out.print("No"+" ");
        }


        if(word.contains("ab")){
            System.out.print("Yes"+" ");
        }else{
            System.out.print("No"+" ");
        }
    }
}