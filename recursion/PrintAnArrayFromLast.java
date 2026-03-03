package recursion;

public class PrintAnArrayFromLast {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
         print(arr, 0);
    }

    private static void print(int arr[], int i) {
        if (i == arr.length)
            return;
        print(arr, i+1);
        System.out.println(arr[i]);
    }
}
