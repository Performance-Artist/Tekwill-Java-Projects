import java.time.LocalDate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String date = sc.nextLine();

        LocalDate dateBefore = LocalDate.parse(date).minusYears(30);
        LocalDate dateAfter = LocalDate.parse(date).plusYears(30);

        System.out.println("The date before 30 years: " + dateBefore);
        System.out.println("The date after 30 years: " + dateAfter);
    }
}
