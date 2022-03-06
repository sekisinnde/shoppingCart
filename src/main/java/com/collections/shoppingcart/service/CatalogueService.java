package com.collections.shoppingcart.service;

import java.util.HashMap;
import java.util.Map;

import com.collections.shoppingcart.models.Category;
import com.collections.shoppingcart.models.Product;

public class CatalogueService {
     // Create a Class CatalogueService containing the methods 
    // necessary to be able to create products, categories ....

    private Map<String, Category> categories = new HashMap<String, Category>();
    private Map<String, Product> products = new HashMap<String, Product>();

    public CatalogueService() {}

    public void addCategory(Category category) {
        categories.put(category.getName(), category);
    }

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }
}
