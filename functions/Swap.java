package functions;

public class Swap {
    public static void main(String[] args) {
         swap(20,10);
    }
    private static void swap(int a ,int b){
        int temp = a;
        a=b;
        b=temp;
        
        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
