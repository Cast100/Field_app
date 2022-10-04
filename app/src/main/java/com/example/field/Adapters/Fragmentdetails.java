package com.example.field.Adapters;

public class Fragmentdetails {

    private String title;
    private int images;


    public Fragmentdetails() {
    }

    public Fragmentdetails(String title, int images) {
        this.title = title;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public int getImages() {
        return images;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
