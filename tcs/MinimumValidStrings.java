public class MinimumValidStrings {
    public static void main(String[] args) {
       String s = "##*"; 
       int res = minimumCount(s);
System.out.print(res);
    }
    private static int minimumCount(String s){
        int star = 0;
        int hash = 0;
        for(char c:s.toCharArray()){
            if(c == '*'){
                star++;
            }else{
                hash++;
            }
        }
        return star - hash;
    }
}
