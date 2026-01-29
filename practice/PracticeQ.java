public class PracticeQ{
    public static void main(String[] args) {
        Product p = new Product("cloth", 1000);
        int total = calculateBill(p, 7);
        System.out.println(total);
    }
    private static int calculateBill(Product p,int quantity){
        return quantity*p.price;
    }
}
class Product{
    String name;
    int price;
    Product(String name,int price){
        this.name = name;
        this.price = price;
    }
}