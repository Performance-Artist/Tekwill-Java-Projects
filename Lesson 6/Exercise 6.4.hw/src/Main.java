import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int arrSize = sc.nextInt();

        System.out.print("Enter the elements of array: ");
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSeq = 1;
        int tempSeq = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                tempSeq++;
                if (maxSeq < tempSeq) {
                    maxSeq++;
                }
            } else if (arr[i] <= arr[i - 1]) {
                tempSeq = 1;
            }
        }
        System.out.println(maxSeq);
    }
}
