import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (word.equals("push_back")) {
                int container = sc.nextInt();
                v.add(container); // add 사용
            } else if (word.equals("pop_back")) {
                if (!v.isEmpty()) {
                    v.remove(v.size() - 1); 
                }
            } else if (word.equals("size")) {
                System.out.println(v.size()); // 크기 출력
            } else if (word.equals("get")) {
                int k = sc.nextInt();
                // k번째 숫자 출력 (1-based index 가정)
                System.out.println(v.get(k - 1));
            }
        }
    }
}
