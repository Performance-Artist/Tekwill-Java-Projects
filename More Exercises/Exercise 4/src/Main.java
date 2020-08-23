import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();//6188989133
        long res = 1;//x
        int mult = 1;//13

        while (res <= number) {
            mult++;
            res *= mult;
        }

        System.out.print(mult);
    }
}