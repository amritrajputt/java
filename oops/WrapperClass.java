package oops;

public class WrapperClass {
    public static void main(String[] args) {
        // Integer num = new Integer(23); // this way when we create then it is not integer varibale now its an object because u create it through Integer() constructor.
        // System.out.println(num);
         Integer a = 10;
         Integer b = 20;
         swap(a,b);
         System.out.println(a+" "+b);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }
}
//if we want to swap 2 varibles value and the variables is created using Integer() constructor because it
//is an object and Integer is of Final Class 