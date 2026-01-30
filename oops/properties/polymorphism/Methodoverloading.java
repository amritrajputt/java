package oops.properties.polymorphism;


public class Methodoverloading {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(23, 4, 4));
    }
    // Methods with same name but different number/type/order of parameters
 
    private static int  sum(int a,int b){
        return a+b;
    }
    private static int  sum(int a,int b,int c){
        return a+b+c;
    }
}
