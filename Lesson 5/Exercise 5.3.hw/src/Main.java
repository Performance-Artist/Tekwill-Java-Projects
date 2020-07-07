import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segments of chocolate in length: ");
        int n = sc.nextInt();
        System.out.print("Segments of chocolate in width: ");
        int m = sc.nextInt();
        System.out.print("How many segments of chocolate do you want to break? ");
        int k = sc.nextInt();

        if (k <= n * m && (k % n == 0 && k >= n || k % m == 0 && k >= m)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
