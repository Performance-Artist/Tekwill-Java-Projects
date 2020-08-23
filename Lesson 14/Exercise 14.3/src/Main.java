import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String line = scanner.nextLine();
        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                StringBuilder sb = new StringBuilder(str);
                return sb.reverse().toString();
            }
        };
        System.out.println(reverser.reverse(line));
    }
}