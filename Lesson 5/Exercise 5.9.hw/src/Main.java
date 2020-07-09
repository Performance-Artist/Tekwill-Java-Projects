import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int i = 0;
        int count = 0;
        do {
           i = sc.nextInt();
           if (i != 0) count++;
        } while (i != 0);
        System.out.println(count);
    }
}
