package oops.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s= new Shape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        s.area();
        r.area();
    }
}
