package com.collections.shoppingcart.models;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;
    
    public Product () {       
    }
    
    public Product (String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


    public Integer getQuantity() {
        return quantity;
    }
}

