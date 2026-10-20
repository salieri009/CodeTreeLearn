import java.util.Scanner;

class Entity {
    String name; 
    String address;
    String region;

    // 생성자
    public Entity(String name, String address, String region){
        this.name = name; 
        this.address = address;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Entity[] entities = new Entity[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            entities[i] = new Entity(name, address, region);
        }

        Entity lastEntity = entities[0];
        for (int i = 1; i < n; i++) {
            if (entities[i].name.compareTo(lastEntity.name) > 0) {
                lastEntity = entities[i];
            }
        }

        // 결과 출력
        System.out.println("name " + lastEntity.name);
        System.out.println("addr " + lastEntity.address);
        System.out.println("city " + lastEntity.region);
    }
}
