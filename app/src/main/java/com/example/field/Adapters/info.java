package com.example.field.Adapters;

public class info {

    private String Name;
    private  String Titles;
    private int Photo ;

    public info() {
    }

    public info(String name, String titles, int photo) {
        Name = name;
        Titles = titles;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitles() {
        return Titles;
    }

    public void setTitles(String titles) {
        Titles = titles;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
