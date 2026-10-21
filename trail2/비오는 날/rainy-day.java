import java.util.Scanner;

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Weather answer = null;

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            Weather w = new Weather(date, day, weather);

            if (w.weather.equals("Rain")) {
                if (answer == null || w.date.compareTo(answer.date) < 0) {
                    answer = w;
                }
            }
        }

        System.out.println(answer.date + " " +
                           answer.day + " " +
                           answer.weather);
    }
}