package com.example.field.Adapters;

public class list {

    private  int img;
    private String top_title;
    private String Team;
    private int Team_img;
    private String soccers;
    private int Pic_team;
    private String Team_vs;

    public list() {
    }

    public list(int img, String top_title, String team, int team_img, String soccers, int pic_team, String team_vs) {
        this.img = img;
        this.top_title = top_title;
        Team = team;
        Team_img = team_img;
        this.soccers = soccers;
        Pic_team = pic_team;
        Team_vs = team_vs;
    }

    public int getImg() {
        return img;
    }

    public String getTop_title() {
        return top_title;
    }

    public String getTeam() {
        return Team;
    }

    public int getTeam_img() {
        return Team_img;
    }

    public String getSoccers() {
        return soccers;
    }

    public int getPic_team() {
        return Pic_team;
    }

    public String getTeam_vs() {
        return Team_vs;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTop_title(String top_title) {
        this.top_title = top_title;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public void setTeam_img(int team_img) {
        Team_img = team_img;
    }

    public void setSoccers(String soccers) {
        this.soccers = soccers;
    }

    public void setPic_team(int pic_team) {
        Pic_team = pic_team;
    }

    public void setTeam_vs(String team_vs) {
        Team_vs = team_vs;
    }
}
