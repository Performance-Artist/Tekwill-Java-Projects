import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0, i;

        for (i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
