public class Main {

    public static void main(String[] args) {
	    Clock c1 =  new Clock(12, 0);
	    c1.display();
        c1.next();
        c1.display();

        Clock c2 =  new Clock(12, 59);
        c2.display();
        c2.next();
        c2.display();
    }
}
