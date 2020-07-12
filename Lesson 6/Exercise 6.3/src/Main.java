import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        String[][] arr = new String[arraySize][arraySize];

        int halfArrLen = (arr.length - 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1 || j == halfArrLen || i == halfArrLen) {
                    arr[i][j] = "*";
                } else {
                    arr[i][j] = ".";
                }
            }
        }

        for (String[] subArr: arr) {
            for (String s: subArr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}