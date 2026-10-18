import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String phone = sc.nextLine();  
        

        String[] parts = phone.split("-");
        

        System.out.println(parts[0] + "-" + parts[2] + "-" + parts[1]);
        
        sc.close();
    }
}
