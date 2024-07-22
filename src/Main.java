public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // Create products
        Product product1 = new Product(1, "Laptop", 10, 999.99);
        Product product2 = new Product(2, "Smartphone", 20, 499.99);

        // Add products to the list
        productManager.addProduct(product1);
        productManager.addProduct(product2);

        // List all products
        System.out.println("Product List:");
        for (Product product : productManager.listProducts()) {
            System.out.println(product);
        }

        // Update a product
        Product updatedProduct = new Product(1, "Laptop", 8, 949.99);
        productManager.updateProduct(updatedProduct);

        // List all products after update
        System.out.println("Updated Product List:");
        for (Product product : productManager.listProducts()) {
            System.out.println(product);
        }

        // Remove a product
        productManager.removeProduct(2);

        // List all products after removal
        System.out.println("Final Product List:");
        for (Product product : productManager.listProducts()) {
            System.out.println(product);
        }
    }
}
