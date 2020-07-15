import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first line: ");
        String st1 = sc.nextLine();
        System.out.print("Enter the second line: ");
        String st2 = sc.nextLine();

        st1 = st1.replace(" ", "").trim();
        st2 = st2.replace(" ", "").trim();

        System.out.println(st1.equals(st2));
    }
}