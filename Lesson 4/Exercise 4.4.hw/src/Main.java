import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

        System.out.print("Height: ");
        int h = s.nextInt();
        System.out.print("Feet up: ");
        int up = s.nextInt();
        System.out.print("Feet down: ");
        int down = s.nextInt();
        int day = 1;

        if(up < h) day += (h - up) / (up - down);
        if((h - up) % (up - down) > 0) day++;

        System.out.println(day + " days");
    }
}
