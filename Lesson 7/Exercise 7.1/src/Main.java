import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = sc.nextLine();
        System.out.print("Enter the beginning of the interval: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the interval: ");
        int end = sc.nextInt();

        System.out.println(st.substring(start, end + 1));
    }
}
