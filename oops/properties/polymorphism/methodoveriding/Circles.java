package oops.properties.polymorphism.methodoveriding;

public class Circles extends Shapes{
    // both shapes class and circles class have same method (name) but with different body 
    @Override // this is annotation this is simple check if the below method is overridden then it doesn't give error but if we write a method that is not overridden then it gives error
    void area(){
        System.out.println("Area of circle is pie * r * r");
    }
}
