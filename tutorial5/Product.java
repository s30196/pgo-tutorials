public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;


    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    public Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        if (numberOfPieces >= 0) {
            this.numberOfPieces = numberOfPieces;
        } else {
            System.out.println("Number of pieces cannot be negative.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }


    public void displayProductDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Product Code: " + productCode);
        System.out.println("Number of Pieces: " + numberOfPieces);
    }
}
