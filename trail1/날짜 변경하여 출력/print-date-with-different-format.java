import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // yyyy.mm.dd 형식 입력받기
        String date = sc.next();

        // "." 기준으로 나누기 (정규식에서 .은 모든 문자라서 \\를 붙여야 함)
        String[] parts = date.split("\\.");

        // parts[0] = yyyy, parts[1] = mm, parts[2] = dd
        String yyyy = parts[0];
        String mm = parts[1];
        String dd = parts[2];

        // 원하는 형식으로 출력
        System.out.println(mm + "-" + dd + "-" + yyyy);
    }
}
