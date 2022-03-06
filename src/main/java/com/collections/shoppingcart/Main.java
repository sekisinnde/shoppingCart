package com.collections.shoppingcart;

import com.collections.shoppingcart.models.AbstractCategory;
import com.collections.shoppingcart.models.Category;
import com.collections.shoppingcart.models.Product;
import com.collections.shoppingcart.models.SubCategory;

public class Main {

    public static void main(String[] args) {
        AbstractCategory category = new Category("cat1", "cat des1");
        AbstractCategory subCategory = new SubCategory("cat2", "cat des2");
        subCategory.setMainCategory(category);

        // SubCategory
        Product product = new Product("prod 1", 10.52, 1);
        Product product2 = new Product("prod 2", 5.52, 10);
        Product product3 = new Product("prod 3", 1.00, 5);

        category.addProducts(product);
        subCategory.addProducts(product2);
        subCategory.addProducts(product3);
    } 
    
}