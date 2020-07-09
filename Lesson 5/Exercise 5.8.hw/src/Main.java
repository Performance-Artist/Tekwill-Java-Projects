import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("The beginning of the interval: ");
	    long a = sc.nextLong();
		System.out.print("The end of the interval: ");
	    long b = sc.nextLong();
	    long result = 1;
	    for (long i = a; i < b; i++)
	        result *= i;

        System.out.println("The product of all integer numbers is " + result);
    }
}
