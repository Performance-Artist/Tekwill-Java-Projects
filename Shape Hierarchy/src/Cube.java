public class Cube implements ThreeDimensionalShape {
    private double length;

    public Cube (double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return 6 * length * length;
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }
}
