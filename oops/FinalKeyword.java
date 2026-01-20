package oops;

public class FinalKeyword {
    public static void main(String[] args) {
        final int INCREAMENT = 2;
        System.out.println(INCREAMENT);
        // INCREAMENT = 3; we cannot modify if it is final
        System.out.println(INCREAMENT);
        final A amrit = new A("amrit rajput");
        amrit.name = "other name";
        System.out.println(amrit.name);
        // amrit = new A("new name"); // reassigning not allowed
    A obj;
    for(int i = 0;i<1000000000;i++){
        obj= new A("Random name ");
    }
    }
}
//cannot modify and always initialize while declaring it.

class A{
    String name;
    final int num = 10;
    public A(String name){
        System.out.println("object created");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}