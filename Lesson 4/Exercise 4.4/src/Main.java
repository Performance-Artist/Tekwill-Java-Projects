import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	    System.out.print("Enter 3 numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println(a + b == 20 || a + c == 20 || b + c == 20);

    }
}
