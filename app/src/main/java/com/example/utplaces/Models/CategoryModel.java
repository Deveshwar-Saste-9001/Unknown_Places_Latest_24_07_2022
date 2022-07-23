package com.example.utplaces.Models;

public class CategoryModel {
    private String categoryIcon;
    private String title;

    public CategoryModel(String categoryIcon, String title) {
        this.categoryIcon = categoryIcon;
        this.title = title;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
