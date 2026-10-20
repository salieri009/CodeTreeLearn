import java.util.Scanner;

class Entity { 
    String name;
    int id; 

    // 생성자
    public Entity(String name, int id){
        this.name = name;
        this.id = id; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();   // 문자열 입력
        int code2 = sc.nextInt(); // 정수 입력

        // 첫 번째 엔티티
        Entity entity = new Entity("codetree", 50);
        // 두 번째 엔티티 (사용자 입력값 활용)
        Entity entity2 = new Entity(id2, code2);

        System.out.println("product " + entity.id + " is " + entity.name);
        System.out.println("product " + entity2.id + " is " + entity2.name);
    }
}
