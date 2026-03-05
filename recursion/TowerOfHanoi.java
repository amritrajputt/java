package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(5, 'A', 'B', 'C');
    }

    private static void towerOfHanoi(int n, char from, char helper, char destination) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from, destination, helper);
        System.out.println(from + "->" + destination);
        towerOfHanoi(n - 1, helper, from, destination);
    }
}
