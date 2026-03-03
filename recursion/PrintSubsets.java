package recursion;

public class PrintSubsets {
    public static void main(String[] args) {
        subsets("abc", "", 0);
    }

    private static void subsets(String s, String ans, int ind) {
        if (ind == s.length()){
            System.out.println(ans+" ");
            return;
        }
        char c=s.charAt(ind);
        subsets(s, ans+c, ind+1);
        subsets(s, ans, ind+1);
    }
}
