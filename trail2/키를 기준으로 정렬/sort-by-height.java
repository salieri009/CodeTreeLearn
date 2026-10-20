import java.util.*;

class Entity implements Comparable<Entity> {
    String name; 
    int height; 
    int weight;

    public Entity(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Entity other) {
        // 키를 기준으로 오름차순 정렬
        return Integer.compare(this.height, other.height);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Entity[] arr = new Entity[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Entity(name, height, weight);
        }

        Arrays.sort(arr); // compareTo 기준으로 정렬

        for (Entity e : arr) {
            System.out.println(e.name + " " + e.height + " " + e.weight);
        }
    }
}
