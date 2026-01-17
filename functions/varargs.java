package functions;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fn(2,3,4);
        multiple(12, 70, "amrit","raj");
    }
    static void multiple(int a,int b ,String ...v){
System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
    static void fn(int ...v){
        System.out.println(Arrays.toString(v)); 
    }
}
