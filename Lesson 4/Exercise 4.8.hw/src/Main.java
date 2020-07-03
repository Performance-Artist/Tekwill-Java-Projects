import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean result;
        if ((a != b) && (a != c) && (b != c)) result = true;
        else result = false;
        System.out.println(result);
    }
}
