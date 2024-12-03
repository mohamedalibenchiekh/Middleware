package models;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products;

    // Constructor initializes the product list
    public ProductList() {
        products = new ArrayList<>();
        products.add(new Product("Laptop", 800, 0.2)); // Example: 20% VAT
        products.add(new Product("Phone", 500, 0.2));
        products.add(new Product("Headphones", 100, 0.1)); // Example: 10% VAT
        products.add(new Product("Keyboard", 50, 0.2));
    }

    // Find a product by name
    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null; // Return null if no product matches
    }
}
