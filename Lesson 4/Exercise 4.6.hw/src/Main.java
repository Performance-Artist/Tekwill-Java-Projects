import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double dif = b - a;
        System.out.println("The difference between 2 numbers is " + dif);
    }
}
