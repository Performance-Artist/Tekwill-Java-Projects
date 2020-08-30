import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date and time: ");
        String inDate = sc.nextLine();

        System.out.print("Enter the number of minutes: ");
        int min = sc.nextInt();

        LocalDateTime date = LocalDateTime.parse(inDate).plusMinutes(min);

        System.out.printf("%d %d %s", date.getYear(), date.getDayOfYear(), date.toLocalTime());
    }
}