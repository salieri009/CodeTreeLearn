import java.util.Scanner;

class Entity{
    String code;
    char color;
    int second;

    public Entity(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;


    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Entity entity = new Entity(uCode, lColor, time);

        System.out.println("code : " + entity.code);
        System.out.println("color : " + entity.color);
        System.out.println("second : " + entity.second);
    }
}