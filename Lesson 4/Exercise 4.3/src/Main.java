import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        double result = x * x * x + x * x + x + 1;
        //System.out.println(Math.pow(x, 3) + Math.pow(x, 2) + x + 1); //using Math.pow(nr, power) method
        System.out.println("result is " + result);

    }
}
