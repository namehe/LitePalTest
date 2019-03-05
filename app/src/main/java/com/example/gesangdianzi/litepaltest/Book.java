package com.example.gesangdianzi.litepaltest;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

public class Book extends LitePalSupport {
    private int id;
    private String author;
    private String name;
    private int pages;
    private double price;
    private String press;
    public Book(){

    }
    public Book(String author, String name, int pages, double price, String press) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.price = price;
        this.press = press;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
