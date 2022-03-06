package com.collections.shoppingcart.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class  AbstractCategory {
    private String name;
    private String description;
    List<AbstractCategory> categories;
    List<Product> products;

    public AbstractCategory(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public void addProducts(Product product) {
        if(Objects.nonNull(product)) {
            this.products.add(product);
        }
    }

    public void addCategory(AbstractCategory category) {
        if(Objects.nonNull(category)) {
            this.categories.add(category);
        }
    }
    

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public abstract void setMainCategory(AbstractCategory category);
}