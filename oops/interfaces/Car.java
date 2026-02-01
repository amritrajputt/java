package oops.interfaces;

public class Car implements Engine, Brake, Media { // here we do multiple inheritance by using interfaces
    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }

    
    public void accelarate() {
        System.out.println("i accelarate like a normal car");
    }
}
