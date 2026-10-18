import java.util.Scanner;

class Entity {   
    String id;
    int level;

    public Entity(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        Entity entity1 = new Entity("codetree", 10);
        Entity entity2 = new Entity(id, level);

        System.out.println("user " + entity1.id + " lv " + entity1.level);
        System.out.println("user " + entity2.id + " lv " + entity2.level);
    }
}
