import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.print("How many squirrels? ");
        int squirrels = sc.nextInt();
        System.out.print("How many nuts? ");
        int nuts = sc.nextInt();

        int result = nuts / squirrels;
        System.out.println(result + " nuts");
    }
}
