public class Test {
    public static void main(String[] args) {

        // Instantiate
        Cube c1 = new Cube(3);
        Cube c2 = new Cube(5);

        Cuboid oid1 = new Cuboid(2, 4, 6);
        Cuboid oid2 = new Cuboid(3, 6, 9);
        Cuboid oid3 = new Cuboid(2.47, 4.78, 6.48);

        Sphere spehere1 = new Sphere(2);
        Sphere spehere2 = new Sphere(3);
        Sphere spehere3 = new Sphere(7);

        //Methods

        // Cubes

        // Ausgabe in eigener Methode
        // Würfel 1
        double x = c1.getArea();
        double y = c1.getVolume();
        ausgabeCube(x, y);

        //Ausgabe in Main
        // Würfel 2
        c2.getArea();
        c2.getVolume();
        System.out.println("Der Würfel2 hat eine Fläche von " + c2.getVolume());
        System.out.println("Der Würfel2 hat ein Volumen von " + c2.getArea());

        //Cuboids

        // Ausgabe in eigener Methode
        // Quader1
        double q = oid1.getArea();
        double r = oid1.getVolume();
        ausgabeCuboid(q, r);

        //Ausgabe in Main
        //Quader 2 und 3
        oid2.getArea();
        oid2.getVolume();
        oid3.getArea();
        oid3.getVolume();
        System.out.println("Der Quader2 hat eine Fläche von " + oid2.getVolume());
        System.out.println("Der Quader2 hat ein Volumen von " + oid2.getArea());
        System.out.println();
        System.out.println("Der Quader3 hat eine Fläche von " + oid3.getVolume());
        System.out.println("Der Quader3 hat ein Volumen von " + oid3.getArea());
        System.out.println();

        // Spheres

        // Ausgabe in eigener Methode
        // Kugel1
        double m = spehere1.getArea();
        double n = spehere1.getVolume();
        ausgabeSphere(m, n);

        //Ausgabe in Main
        spehere2.getArea();
        spehere2.getVolume();

        System.out.println("Die Kugel2 hat eine Fläche von " + spehere2.getVolume());
        System.out.println("Die Kugel2 hat ein Volumen von " + spehere2.getArea());
        System.out.println();
        System.out.println("Die Kugel3 hat eine Fläche von " + spehere3.getVolume());
        System.out.println("Die Kugel3 hat ein Volumen von " + spehere3.getArea());
    }

    private static void ausgabeCube(double x, double y) {
        System.out.println("Der Würfel1 hat eine Fläche von " + x);
        System.out.println("Der Würfel1 hat ein Volumen von " + y);
    }

    private static void ausgabeCuboid(double q, double r) {
        System.out.println("Der Quader1 hat eine Fläche von " + q);
        System.out.println("Der Quader1 hat ein Volumen von " + r);
    }

    private static void ausgabeSphere(double m, double n) {
        System.out.println("Die Kugel1 hat eine Fläche von " + m);
        System.out.println("Die Kugel1 hat ein Volumen von " + n);
    }


}
