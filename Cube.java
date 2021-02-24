public class Cube extends Shape3D {

    private double edgeLength;

    public Cube(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double getVolume() {
        double volume = edgeLength*edgeLength*edgeLength;
        return volume;
    }

    @Override
    public double getArea() {
        double area = edgeLength*edgeLength*6;
        return area;
    }
}
