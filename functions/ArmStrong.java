package functions;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println(armStrong(153));
    }
    static boolean armStrong(int n){
        int original = n;
        int res = 0;
        while(n>0){
        int rem = n%10;
        int cube = rem*rem*rem;
        res += cube;
        n=n/10;
        }
        if (res == original) return true;
        else return false;
    }
}
