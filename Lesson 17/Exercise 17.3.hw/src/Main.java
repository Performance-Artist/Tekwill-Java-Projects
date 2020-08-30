import java.util.Scanner;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
	    int year = sc.nextInt();
		System.out.print("Enter the month: ");
	    int month = sc.nextInt();

		LocalDate first = LocalDate.of(year, month, 1);

		LocalDate last = LocalDate.of(year, month, first.lengthOfMonth());

		System.out.println(first + " " + last);
    }
}
