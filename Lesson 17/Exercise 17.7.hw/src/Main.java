import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date and time: ");
        String dateTimeIn = sc.next();

        System.out.print("Enter the days: ");
        int days = Integer.parseInt(sc.next());
        System.out.print("Enter the hours: ");
        int hours = Integer.parseInt(sc.next());

        LocalDateTime parse = LocalDateTime.parse(dateTimeIn);

        System.out.println(parse.plusDays(days).minusHours(hours));
    }
}