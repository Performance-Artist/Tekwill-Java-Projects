import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        StringBuilder res = new StringBuilder(String.valueOf(str.charAt(0)));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == str.charAt(i)) {
                count++;
            } else {
                res.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        res.append(count);
        System.out.println(res);
    }
}
