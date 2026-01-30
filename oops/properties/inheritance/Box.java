package oops.properties.inheritance;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    Box(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    Box(double length, double width,double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }
}
