package oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelarate();
        car.start();
        car.stop();
        car.brake();
        Media carMedia = new Car();
        carMedia.stop();
    }
}
