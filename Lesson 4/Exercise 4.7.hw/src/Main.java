import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();
        boolean result;
        if ((n < 10) && (n > 0)) result = true;
        else result = false;
        System.out.println(result);
    }
}
