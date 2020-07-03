import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name please!");
        String name = sc.nextLine();

        System.out.println("Now your age please!");
        int age = sc.nextInt();

        System.out.println("Hi, my name is " + name + "!");
        System.out.println("I'm " + age + " years old!");

    }
}
