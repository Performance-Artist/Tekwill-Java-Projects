import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String strDate = sc.nextLine();

        LocalDate date = LocalDate.parse(strDate).minusDays(10);
        System.out.println(date);
    }
}