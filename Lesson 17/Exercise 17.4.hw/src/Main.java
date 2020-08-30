import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time: ");

        String timeString = sc.next();

        LocalTime time = LocalTime.parse(timeString).withSecond(0);

        System.out.println(time);
    }
}