package oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println("this is the first constructor " +box1.length+" "+box1.length+" "+box1.height);
        
        Box box2 = new Box(5,4);
        System.out.println("this is the second constructor "+box2.length+" "+box2.width);
        
        Box box3 = new Box(5);
        System.out.println("this is the third constructor "+box3.length+" "+box3.width+" "+box3.height);
        
        Boxweight extendedBox = new Boxweight();
        System.out.println("this is the extended box which extend the properties of box and add weight to its own: " +extendedBox.length+" "+extendedBox.length+" "+
        extendedBox.height+" "+extendedBox.weight);

        Boxweight extendedBox2 = new Boxweight(2,2,3,4);
        System.out.println("this is the second extended box which extend the properties of box and add weight to its own: " +extendedBox2.length+" "+extendedBox2.length+" "+
        extendedBox2.height+" "+extendedBox2.weight);

        Boxprice multipleInheritance = new Boxprice(1,23,4,5,50);
        System.out.println("this is the second extended box which extend the properties of box and add weight to its own: " +multipleInheritance.length+" "+multipleInheritance.width+" "+
        multipleInheritance.height+" "+multipleInheritance.weight+" "+multipleInheritance.price);
    }
}