import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products;
    private User user;


    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public ShoppingCart(User user) {
        this();
        this.user = user;
    }

    public ShoppingCart(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }


    public void addProduct(Product product) {
        if (product.getNumberOfPieces() > 0) {
            this.products.add(product);
            product.setNumberOfPieces(product.getNumberOfPieces() - 1);
        } else {
            System.out.println("Product is out of stock!");
        }
    }

    public void removeProduct(Product product) {
        if (this.products.contains(product)) {
            this.products.remove(product);
            product.setNumberOfPieces(product.getNumberOfPieces() + 1);
        } else {
            System.out.println("Product not in cart!");
        }
    }


    public double pay() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        products.clear();
        return total;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                ", user=" + user +
                '}';
    }
}
