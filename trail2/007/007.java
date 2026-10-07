import java.util.Scanner;

class Obj {  

    String code;
    char point;
    int time ;
    
    public Obj( String code, char point, int time){

        this.code = code;
        this.point = point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode = sc.next();       
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();        

        // 객체 생성
        Obj obj = new Obj(sCode, mPoint, time);

        // 출력
        System.out.println("secret code : " + obj.code);
        System.out.println("meeting point : "+ obj.point); 
        System.out.println("time : " + obj.time);
    }
}
