import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String st = "You have chosen a ";
        int choice = sc.nextInt();
        switch(choice) {
            case 1: st += "square";
                break;
            case 2: st += "circle";
                break;
            case 3: st += "triangle";
                break;
            case 4: st += "rhombus";
                break;
			default: st = "There is no such shape!";
        }
        System.out.println(st + choice);
    }
}
