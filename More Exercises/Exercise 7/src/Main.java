import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.print("Choose a programming language you are learning: ");
        // 1-Java, 2-Kotlin, 3-Scala, 4-Python
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}
