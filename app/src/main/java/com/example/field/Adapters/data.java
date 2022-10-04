package com.example.field.Adapters;

public class data {
    private int image;
  private String text_groud,text_match;

    public data() {
    }

    public data(int image, String text_groud, String text_match) {
        this.image = image;
        this.text_groud = text_groud;
        this.text_match = text_match;
    }

    public int getImage() {
        return image;
    }

    public String getText_groud() {
        return text_groud;
    }

    public String getText_match() {
        return text_match;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setText_groud(String text_groud) {
        this.text_groud = text_groud;
    }

    public void setText_match(String text_match) {
        this.text_match = text_match;
    }
}
