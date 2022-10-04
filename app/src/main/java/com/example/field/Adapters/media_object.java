package com.example.field.Adapters;

public class media_object {

   private String Title;
   private String Url;
   private String thumbnail;
   private String Description;

    public media_object(String title, String url, String thumbnail, String description) {
        this.Title = title;
        this.Url = url;
        this.thumbnail = thumbnail;
        this.Description = description;
    }

    public media_object() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
