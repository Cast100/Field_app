package com.example.field.Adapters;

public class Model extends champ_adpt {


    private int imgs;
    private String title;

    public Model() {
    }

    public Model(int imgs, String title) {
        this.imgs = imgs;
        this.title = title;
    }

    public int getImgs() {
        return imgs;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setImgs(int imgs) {
        this.imgs = imgs;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
