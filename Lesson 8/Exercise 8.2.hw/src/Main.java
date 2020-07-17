import java.util.Scanner;
public class Main {
    public static boolean isVowel ( char ch) {
        boolean bool;
        if (ch == 'A' || ch == 'E' ||ch == 'I' || ch == 'O' || ch == 'U' ) bool = true;
        else if (ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u' ) bool = true;
        else bool = false;
        return bool;
    }
    /* Do not change code below */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO" );
    }
}
