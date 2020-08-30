import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date and time: ");
        String str = sc.nextLine();

        LocalDateTime parse = LocalDateTime.parse(str).plusHours(11);

        LocalDate date = parse.toLocalDate();

        System.out.println(date);
    }
}