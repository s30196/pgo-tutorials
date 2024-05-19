import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Category category1 = new Category();
        Category category2 = new Category("electronics");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("laptop", 123, "qwe123", 10));
        Category category3 = new Category("Home Appliances", productList);


        Product product1 = new Product("phone", 321, "qwe456", 5);
        Product product2 = new Product("fridge", 6546, "ret567", 3);
        category1.addProduct(product1);
        category2.addProduct(product2);


        User user1 = new User("Alice", "Smith", "xxxx@xxx.com", "pass312");
        User user2 = new User("Bob", "Johnson", "xxx@xxx.com", "pass123");


        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart(user1);
        ShoppingCart cart3 = new ShoppingCart(user2, new ArrayList<>());


        cart1.addProduct(product1);
        cart2.addProduct(product2);
        cart2.addProduct(new Product("microwave", 32, "rewt2345", 2));


        cart3.addProduct(product1);
        cart3.removeProduct(product1);


        double total1 = cart1.pay();
        double total2 = cart2.pay();
        double total3 = cart3.pay();


        System.out.println("Total for cart1: $" + total1);
        System.out.println("Total for cart2: $" + total2);
        System.out.println("Total for cart3: $" + total3);


        System.out.println(category1);
        System.out.println(category2);
        System.out.println(category3);
        System.out.println(cart1);
        System.out.println(cart2);
        System.out.println(cart3);
    }
}
