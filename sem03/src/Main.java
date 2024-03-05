import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // write your code here
        OnlineShop o = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setProdName("Paine");

        o.addOrder(p1);
        o.addOrder(p2);

        o.addOrder(p1);
        System.out.println(p1.equals(p2));
    }
}
