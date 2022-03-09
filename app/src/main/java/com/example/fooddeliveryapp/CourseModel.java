package com.example.fooddeliveryapp;

import android.widget.Button;

public class CourseModel {


    private String item_name;
    private int item_price;
    private int item_Image;

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public int getItem_Image() {
        return item_Image;
    }

    public void setItem_Image(int item_Image) {
        this.item_Image = item_Image;
    }

    public CourseModel(String item_name, int item_price, int item_Image) {
        this.item_name = item_name;
        this.item_price = item_price;
        this.item_Image = item_Image;
    }
}


