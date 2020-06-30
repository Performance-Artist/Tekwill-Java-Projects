public class Main {

    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        float f1 = (float) d;
        long l1 = (long) f1;
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte b1 = (byte) s1;
        System.out.println(b1);
        char c = (char) 123;
        System.out.println(c);

    }
}
