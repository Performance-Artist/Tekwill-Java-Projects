import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        System.out.println("The sum of the elements of array is " + sum);
    }
}