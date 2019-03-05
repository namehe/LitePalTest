package com.example.gesangdianzi.litepaltest;

import org.litepal.crud.LitePalSupport;

public class Category extends LitePalSupport {
    private int id;
    private String categoryName;
    private int categoryCode;

    public int getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }
}
