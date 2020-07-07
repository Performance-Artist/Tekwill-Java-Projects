import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        System.out.print("Minimum hours to sleep: ");
        int A = s.nextInt();
        System.out.print("Maximum hours to sleep: ");
        int B = s.nextInt();
        System.out.print("How many hours does Ann sleep? ");
        int H = s.nextInt();

        if (H < A) System.out.println("Deficiency");
        else if (H > B) System.out.println("Excess");
        else System.out.println("Normal");
    }
}
