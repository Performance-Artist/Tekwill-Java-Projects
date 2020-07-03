import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean result;
        if (((a > 0) && (b <= 0) && (c <= 0)) || ((b > 0) && (a <= 0) && (c <= 0)) || ((c > 0) && (a <= 0) && (b <= 0))) result = true;
        else result = false;
        System.out.println(result);
    }
}
