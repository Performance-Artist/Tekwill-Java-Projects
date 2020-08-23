public class Main {

    public static void main(String[] args) {
	    Shape c1 = new Circle (14.5);
	    Shape c2 = new Circle(20.1);
	    Shape sq1 = new Square(2.6);
        Shape sq2 = new Square(7.0);
        Shape tr1 = new Triangle(10, 4, 8);
        Shape tr2 = new Triangle(6.2, 7.4, 5.6);
        Shape cb1 = new Cube(5.5);
        Shape cb2 = new Cube(10.2);
        Shape sp1 = new Sphere(15.3);
        Shape sp2 = new Sphere(9.4);
        Shape tet1 = new Tetrahedron(6.0);
        Shape tet2 = new Tetrahedron(11.1);

        Shape[] arr = {c1, c2, sq1, sq2, tr1, tr2, cb1, cb2, sp1, sp2, tet1, tet2};

        for (Shape shape : arr) {
            System.out.println(shape.getClass() + " area is: " + shape.getArea());
        }
    }
}
