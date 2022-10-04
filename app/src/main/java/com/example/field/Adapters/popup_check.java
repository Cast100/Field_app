package com.example.field.Adapters;

public class popup_check {

    private String name;
    private int  img_id;

    public popup_check() {
    }

    public popup_check(String name, int img_id) {
        this.name = name;
        this.img_id = img_id;
    }

    public String getName() {
        return name;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }
}
