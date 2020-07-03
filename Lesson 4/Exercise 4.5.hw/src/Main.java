import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("The distance between two cities in km: ");
        int d = sc.nextInt();
        System.out.print("The travel time by bus in hours: ");
        double t = sc.nextInt();
        double s = d / t;
        System.out.println("The average speed of the bus is " + s);
    }
}
