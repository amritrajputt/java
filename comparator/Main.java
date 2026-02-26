package comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class SortByLength implements Comparator<String>{
    @Override
    public int compare(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        return len1-len2;
    }
}

public class Main {


    public static void main(String[] args) {
        List<String> names = Arrays.asList( "amrit raj", "amrit rajput","amrit");
        names.sort(new SortByLength());
        System.out.println(names);
    }
}
