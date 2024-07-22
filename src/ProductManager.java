import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    // Add a new product to the list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove a product from the list by ID
    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    // Update an existing product in the list
    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == updatedProduct.getId()) {
                products.set(i, updatedProduct);
                return;
            }
        }
    }

    // List all products
    public List<Product> listProducts() {
        return products;
    }
}
