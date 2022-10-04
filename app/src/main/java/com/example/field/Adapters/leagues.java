package com.example.field.Adapters;

public class leagues {

    private int images;
    private String Name;

    public leagues() {
    }

    public leagues(int images, String name) {
        this.images = images;
        Name = name;
    }

    public int getImages() {
        return images;
    }

    public String getName() {
        return Name;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public void setName(String name) {
        Name = name;
    }
}
