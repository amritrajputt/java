public class Demo69 {
    public static void main(String[] args) {
        preInPost(3);
    }

    private static void preInPost(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " ");
        preInPost(n - 1);
        System.out.println(n + " ");
        preInPost(n - 1);
        System.out.println(n + " ");
    }
}
