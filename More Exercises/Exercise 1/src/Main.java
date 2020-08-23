import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        System.out.print("d = ");
        int d = sc.nextInt();

        int count = 0;
        for (int x = 1; x < 1000; x++) {
            long l = a * (long) Math.pow(x, 3) + b * x * x + c * x + d;
            if (l == 0) {
                System.out.println(x);
                count++;
                if(count == 3) {
                    break;
                }
            }
        }
    }
}