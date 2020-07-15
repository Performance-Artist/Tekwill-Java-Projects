import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String in = sc.nextLine();
        System.out.print("Enter the substring: ");
        String st = sc.nextLine();

        int count = 0;
        int pos = 0;

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == st.charAt(pos)) {
                pos++;
                if (pos == st.length()) {
                    count++;
                    pos = 0;
                }
            }
            else {
                pos = 0;
            }
        }
        System.out.println(count);
    }
}
