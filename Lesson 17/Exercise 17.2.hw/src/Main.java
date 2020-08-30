import java.time.LocalDate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String strDate = sc.nextLine();

        int dayOfYear = LocalDate.parse(strDate).getDayOfYear();
        int dayOfMonth = LocalDate.parse(strDate).getDayOfMonth();

        System.out.println(dayOfYear + " " + dayOfMonth);
    }
}