public class Tetrahedron implements ThreeDimensionalShape {
    private double length;

    public Tetrahedron (double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * length * length;
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3) / (6 * Math.sqrt(2));
    }
}
