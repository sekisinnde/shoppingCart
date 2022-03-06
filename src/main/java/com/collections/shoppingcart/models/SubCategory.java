package com.collections.shoppingcart.models;

public class SubCategory extends AbstractCategory{
    private AbstractCategory mainCategory;
    
    public SubCategory(String name, String description) {
        super(name, description);
    }
    
    public AbstractCategory getMainCategory() {
        return mainCategory;
    }

    @Override
    public void setMainCategory(AbstractCategory mainCategory) {
        this.mainCategory = mainCategory;
    }
}
