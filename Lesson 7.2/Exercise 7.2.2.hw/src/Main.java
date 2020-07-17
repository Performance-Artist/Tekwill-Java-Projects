import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String unformattedDate = sc.nextLine();

        String[] dateArray = unformattedDate.split("-");
        String formattedDate = String.format("%s/%s/%s", dateArray[1], dateArray[2], dateArray[0]);
        System.out.println(formattedDate);
    }
}
