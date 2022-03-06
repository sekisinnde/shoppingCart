package com.collections.shoppingcart.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shoppingcart {
    private List<Product> products = new ArrayList<>();
    
    public void addToCart(Product product) {
        if(Objects.nonNull(product)) {
            this.products.add(product);
        }
        // you have to throw and error incase product is null
    }
    
    public Shoppingcart getCart() {
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }
}
