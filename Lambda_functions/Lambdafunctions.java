package Lambda_functions;

import java.util.*;
import java.util.function.*;

public class Lambdafunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        // arr.forEach((item) -> {
        // System.out.println(item*2);
        // });

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        // below 3 lines are body of abstract method
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation product = (a, b) -> a * b;

        Lambdafunctions myCalculator = new Lambdafunctions();

        System.out.println(myCalculator.operate(5, 4, sum));
        System.out.println(myCalculator.operate(5, 4, product));
        System.out.println(myCalculator.operate(5, 4, sub));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

}

interface Operation {
    int operation(int a, int b);
}