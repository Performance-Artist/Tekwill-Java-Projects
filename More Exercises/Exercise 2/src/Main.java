import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the interval: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        double sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        double result = sum / count;
        System.out.println("Result: " + result);
    }
}
