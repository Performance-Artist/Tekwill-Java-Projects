import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time 1: ");
        String inTime1 = sc.nextLine();
        System.out.print("Enter the time 2: ");
        String inTime2 = sc.nextLine();


        LocalTime time1 = LocalTime.parse(inTime1);
        LocalTime time2 = LocalTime.parse(inTime2);


        int sec = time1.toSecondOfDay() - time2.toSecondOfDay();
        System.out.println(Math.abs(sec) + " seconds");
    }
}