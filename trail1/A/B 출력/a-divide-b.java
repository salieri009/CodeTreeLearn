import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        BigDecimal result = new BigDecimal(a)
                                .divide(new BigDecimal(b), 21, RoundingMode.DOWN);

        String output = result.setScale(20, RoundingMode.DOWN).toPlainString();
        System.out.println(output);
    }
}
