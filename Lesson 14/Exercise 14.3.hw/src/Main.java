public class Main {

    public static void main(String[] args) {
        Shape r = new Rectangle(17.68, 10.12);
        Shape t = new Triangle(7.62, 11.42, 14);
        Shape c = new Circle(7.77);

        Shape[] arr = {r, t, c};

        for (Shape shape : arr) {
            System.out.println(shape.getClass() + " area is: " + shape.getArea());
            System.out.println(shape.getClass() + " perimeter is: " + shape.getPerimeter());
        }
    }
}
