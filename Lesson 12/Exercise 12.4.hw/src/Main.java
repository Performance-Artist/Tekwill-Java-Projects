public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(8);
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(5, 4);
        Shape square = new Square(3);

        System.out.print("The area of a circle is ");
        printAreaOfShape(circle);
        System.out.print("The area of a triangle is ");
        printAreaOfShape(triangle);
        System.out.print("The area of a rectangle is ");
        printAreaOfShape(rectangle);
        System.out.print("The area of a square is ");
        printAreaOfShape(square);
    }

    public static void printAreaOfShape(Shape shape) {
        System.out.println(shape.area());
    }
}
