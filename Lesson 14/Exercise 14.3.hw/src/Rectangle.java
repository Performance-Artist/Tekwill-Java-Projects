public class Rectangle extends Shape {
    double height;
    double width;

    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    double getArea() {
        return height * width;
    }
}
