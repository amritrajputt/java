package oops.abstractclasses;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("i am going to be a " + name);
    }
    @Override
    void partner(String name, int age) {
        System.out.println("i love " + name + " she is " + age + " years old");
    }
}
