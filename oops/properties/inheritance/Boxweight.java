package oops.properties.inheritance;

public class Boxweight extends Box {
    double weight;

    Boxweight() {
        
        this.weight = -1;
    }

    Boxweight(double length, double width,double height,double weight) {
         super(length,width,height);
         this.weight = weight;
    }
    

}