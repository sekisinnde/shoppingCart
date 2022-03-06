package com.collections.shoppingcart.models;

public class Category extends AbstractCategory {
    public Category(String name, String description) {
        super(name, description);
    }

    @Override
    public void setMainCategory(AbstractCategory mainCategory) {
        return;
    }
}
