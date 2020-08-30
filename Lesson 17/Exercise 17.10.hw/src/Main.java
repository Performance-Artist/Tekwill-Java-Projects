import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String inDate = sc.next();
        int days = sc.nextInt();

        LocalDate date = LocalDate.parse(inDate);

//        LocalDate newYearDate = date.withMonth(12).withDayOfMonth(31);
//        LocalDate date1 = date.plusDays(days);
//        System.out.println(date1.isAfter(newYearDate));

        LocalDate newYearDate = date.plusDays(days);
        System.out.println(date.getYear() > newYearDate.getYear());
    }
}