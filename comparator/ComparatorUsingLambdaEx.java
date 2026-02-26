package comparator;

import java.util.Arrays;
import java.util.List;

public class ComparatorUsingLambdaEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("amrit raj", "aa","amrit rajput", "amrit", "akk");
        names.sort((a, b) -> {
            int c1 = 0;
            int c2 = 0;

            for (char c : a.toCharArray()) {
                if (c == 'a')
                    c1++;
            }

            for (char c : b.toCharArray()) {
                if (c == 'a')
                    c2++;
            }
            return c1-c2;
        });
        System.out.println(names);
    }

}
