import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("Choose the direction: ");
        int choice = sc.nextInt();

        String st = "Move ";
        switch (choice) {
            case 1:
                st += "up";
                break;

            case 2:
                st += "down";
                break;

            case 3:
                st += "left";
                break;

            case 4:
                st += "right";
                break;

            case 0:
                st = "Do not move";
                break;

            default:
                st = "Error";
                break;
        }
        System.out.println(st);
    }
}
