package string;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        String name1 = "Amrit";
        String name2 = "Amrit";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        String name3 = new String("amrit");
        String name4 = new String("amrit");
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));


        name1 = name1 + "rajput";
        System.out.println(name1);

        name1 = name1 + new ArrayList<>(); // converts list into string by toString() method
        System.out.println(name1.getClass().getName());
    }
}