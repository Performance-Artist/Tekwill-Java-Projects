import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The quantity of the elements of the array: ");
        int length = sc.nextInt();
        int [] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println(sum);
    }
}
