import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int m = sc.nextInt();
        int[] array;
        array = new int[m];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < m; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (array[i] > n) sum += array[i];
        }
        System.out.println("The sum is " + sum);
    }
}
