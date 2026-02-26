package methodreference;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       List <String>names = Arrays.asList("Amrit","amrit raj","amrit rajput");
       System.out.println("This is normal printing using lambda expressions");
       names.forEach(name -> System.out.print(name+" "));
       System.out.println();

       System.out.println("This is printing using calling printname function for each string");
       names.forEach(name -> printName(name));
       System.out.println();

       System.out.println("This is printing using method reference using classname");
       names.forEach(Main::printName);
    }
    private static void printName(String name){
        System.out.print(name+" ");
    }
}
