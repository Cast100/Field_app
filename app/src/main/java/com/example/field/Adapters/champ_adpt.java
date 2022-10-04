package com.example.field.Adapters;

public class champ_adpt {

    private int Images;
    private String title;


    public champ_adpt() {
    }

    public champ_adpt(int images, String title) {
        Images = images;
        this.title = title;
    }

    public int getImages() {
        return Images;
    }

    public String getTitle() {
        return title;
    }

    public void setImages(int images) {
        Images = images;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
