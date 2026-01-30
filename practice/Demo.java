import oops.properties.inheritance.Box;

public class Demo {
    public static void main(String[] args) {
        Box box1 = new Box(5);
        System.out.println(box1.length);
        Box box2 = new Box(4);
        System.out.println(box2.length);
    }
}

class Box{
int length;
    Box(int length){
        this.length = length;
        // length = length;
    }
}