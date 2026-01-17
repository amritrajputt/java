package functions;

public class functionOverloading {
    public static void main(String[] args) {
        fun(6);
        fun("amrit");
    }
    // 2 methods with same name can be exist but with different arguments
    static void fun(int a){
        System.out.println(a);
    }
     static void fun(String s){
        System.out.println(s);
    }
}
