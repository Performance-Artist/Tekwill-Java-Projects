import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of date and time: ");
        int nr = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the date and time: ");
        LocalDateTime latest = LocalDateTime.parse(sc.nextLine());

        for (int i = 1; i < nr; i++) {
            LocalDateTime newDate = LocalDateTime.parse(sc.nextLine());
            if (newDate.isAfter(latest) ) {
                latest = newDate;
            }
        }

        System.out.println("The latest date and time is " + latest);
    }
}