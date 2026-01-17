package functions;

public class shadowing {
    static int x =90;
    public static void main(String[] args) {
        System.out.println(x); //op:90
        int x = 50;//this shadowed the x which is in class level
        System.out.println(x);//op:40 
    }
}
