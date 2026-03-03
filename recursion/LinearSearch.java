package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,56,6};
        int ele = 56;
        System.out.println(search(arr,0,ele)); 
    }
    private static boolean search(int[] arr,int i,int ele){
        if(i == arr.length) return false;
        if(arr[i]==ele) return true;
        return search(arr, i+1, ele);
    }
}
