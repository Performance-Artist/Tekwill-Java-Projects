public class Square implements TwoDimensionalShape{
    private double length;

    public Square (double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}
