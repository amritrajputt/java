package oops.properties.inheritance;

public class Boxprice extends Boxweight {
    double price;
    Boxprice(double length, double width,double height,double weight,double price){
        super(length, width, height, weight);
        this.price = price;
    }
}
