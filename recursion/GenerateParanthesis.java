package recursion;

import java.util.*;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n = 3;
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        generateValidParenthesis(n, result, sb, 0, 0);
        System.out.println(result);
    }

    private static void generateValidParenthesis(int n, List<String> res, StringBuilder s, int noOfLeftParanthesis,
            int noOfRightParanthesis) {
                if(s.length() == 2*n){
                    res.add(s.toString());
                    return;
                }
                if(noOfLeftParanthesis < n){
                    s.append("(");
                    generateValidParenthesis(n, res, s, noOfLeftParanthesis+1, noOfRightParanthesis);
                    s.deleteCharAt(s.length()-1);
                }
                 if(noOfLeftParanthesis > noOfRightParanthesis){
                    s.append(")");
                    generateValidParenthesis(n, res, s, noOfLeftParanthesis, noOfRightParanthesis+1);
                    s.deleteCharAt(s.length()-1);
                }
    }
}
