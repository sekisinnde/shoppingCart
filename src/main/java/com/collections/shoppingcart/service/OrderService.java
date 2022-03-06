package com.collections.shoppingcart.service;

import com.collections.shoppingcart.models.Product;
import com.collections.shoppingcart.models.Shoppingcart;

public class OrderService {
    // containing the methods necessary 
    // to be able to add 1 or more products 
    // to a basket as well as view the total of my basket
    private Shoppingcart basket = new Shoppingcart();

    public OrderService() {}

    public void addProduct(Product product) {
        basket.addToCart(product);
    }

    // total  of products in the basket
    public Integer totalProducts() {
        return basket.getCart().getProducts().size();
    }

    // total price of all products in the basket
    public Double totalPrice() {
        return basket.getCart().getProducts().stream().mapToDouble(Product::getPrice).sum();
    }
}
 