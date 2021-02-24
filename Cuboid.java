public class Cuboid extends Shape3D {

    private double a, b, c;

    public Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getVolume() {
        double volume = a*b*c;
        return volume;
    }

    @Override
    public double getArea() {
        double area = a*b+a*c+b*c;
        return area;
    }
}
