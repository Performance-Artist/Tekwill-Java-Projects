import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seconds: ");
        Long seconds = Long.valueOf(sc.nextLine());

        LocalTime localTime = LocalTime.ofSecondOfDay(seconds);

        System.out.println("The time is " + localTime);
    }
}