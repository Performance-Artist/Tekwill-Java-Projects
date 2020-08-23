import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int n = sc.nextInt();

        int[] grades = new int[4];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            grades[a - 2]++;
        }

        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }
}