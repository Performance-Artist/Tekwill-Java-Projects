public class Main {

    public static void main(String[] args) {
	    IntBinaryOperation add = new Addition(7, 8);
	    IntBinaryOperation mult = new Multiplication(7, 8);
		IntBinaryOperation[] arr = {add, mult};

	    add.perform();
	    mult.perform();

		for (IntBinaryOperation var : arr) {
			int p = var.perform();
			System.out.println(p);
		}
    }
}
