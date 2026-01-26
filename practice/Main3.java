package practice;

public class Main3 {
    public static void main(String[] args) {
        Car c1 = new Car("tesla", 2022);
        Car c2 = new Car("tata", 2012);
        System.out.println("car brand: "+c1.brand+" , "+"year of launch"+" "+c1.year);
        System.out.println("car brand: "+c2.brand+" , "+"year of launch"+" "+c2.year);
    }
}

class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}
