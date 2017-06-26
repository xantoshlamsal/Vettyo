package com.example.dell.vettyo.model;

/**
 * Created by dell on 6/26/2017.
 */

public class AdCardModel {
    private String title;
    private int price;
    private int thumbnail;

    public AdCardModel() {
    }

    public AdCardModel(String title, int price, int thumbnail) {
        this.title = title;
        this.price = price;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }


}
