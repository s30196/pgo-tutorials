
public class Main {
    public static void main(String[] args) {
        User g1 = new User("s0000@pjwstk.edu.pl"); //guest
        User u1 = new User("Andrew", "Doe", "s0001@pjwstk.edu.pl","supersecretpassword");
        g1.registerUser("John","Kowalski","seretpassword2");
        g1.setPassword("Password2");
        System.out.println(g1.getPassword()); //guest to user
        User h1 = new User("Grzegorz", "Doe", "s00000004@pjwstk.edu.pl", "secretpass3"); //just user




        // create products and perform actions from task2

        Product product1 = new Product("Product1", 999.99, "XXXXX1");
        Product product2 = new Product("Product2", 699.99, "XXXXX2", 5);
        Product product3 = new Product("Headphones", 49.99, "SXSXSXS3", 10);

        product1.setPrice(1099.99);

        product2.setNumberOfPieces(5);


        /*
        System.out.println("Product 1:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2:");
        product2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3:");
        product3.displayProductDetails();
        */
    }
}