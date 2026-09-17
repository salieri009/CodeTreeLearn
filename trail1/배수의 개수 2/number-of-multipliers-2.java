import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int cnt =0 ;
        for (int i=0; i<=9; i++){
            list.add(sc.nextInt());
            if(list.get(i) % 2 == 1){
                cnt ++;
            }
            

        }
       
 
        System.out.println(cnt);
    }
}
