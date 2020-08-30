import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time: ");
        String inTime = sc.nextLine();

        System.out.print("Enter the hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter the minutes: ");
        int minutes = sc.nextInt();

        LocalTime time = LocalTime.parse(inTime)
                .minusHours(hours)
                .minusMinutes(minutes);

        System.out.println(time);
    }
}