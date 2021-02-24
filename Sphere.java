public class Sphere extends Shape3D{

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        double volume = 4/3 * Math.PI * radius*radius*radius;
        return volume;
    }

    @Override
    public double getArea() {
        double area = 4*Math.PI*radius*radius;
        return area;
    }
}
