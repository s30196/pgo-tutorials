import java.util.ArrayList;
import java.util.List;

class Category {
    private String name;
    private List<Product> products;


    public Category() {
        this.name = "Main Category";
        this.products = new ArrayList<>();
    }

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
