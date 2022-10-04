package com.example.field.Adapters;

public class teamlist extends list {


    private int images;
    private  String title;
    private String team,team2,team3;
    private int icon_team,icon_team2,icon_team3;
    private  String soccer,soccer2,soccer3;
    private int image_team,image_team2,image_team3;
    private  String vs_team,vs_team2,vs_team3;
    private boolean isChecked;

    public teamlist() {
    }

    public teamlist(int images, String title, String team, String team2, String team3, int icon_team, int icon_team2, int icon_team3, String soccer, String soccer2, String soccer3, int image_team, int image_team2, int image_team3, String vs_team, String vs_team2, String vs_team3, boolean isChecked) {
        this.images = images;
        this.title = title;
        this.team = team;
        this.team2 = team2;
        this.team3 = team3;
        this.icon_team = icon_team;
        this.icon_team2 = icon_team2;
        this.icon_team3 = icon_team3;
        this.soccer = soccer;
        this.soccer2 = soccer2;
        this.soccer3 = soccer3;
        this.image_team = image_team;
        this.image_team2 = image_team2;
        this.image_team3 = image_team3;
        this.vs_team = vs_team;
        this.vs_team2 = vs_team2;
        this.vs_team3 = vs_team3;
        this.isChecked = isChecked;
    }

    public teamlist(int img, String top_title, String team, int team_img, String soccers, int pic_team, String team_vs, int images, String title, String team1, String team2, String team3, int icon_team, int icon_team2, int icon_team3, String soccer, String soccer2, String soccer3, int image_team, int image_team2, int image_team3, String vs_team, String vs_team2, String vs_team3, boolean isChecked) {
        super(img, top_title, team, team_img, soccers, pic_team, team_vs);
        this.images = images;
        this.title = title;
        this.team = team1;
        this.team2 = team2;
        this.team3 = team3;
        this.icon_team = icon_team;
        this.icon_team2 = icon_team2;
        this.icon_team3 = icon_team3;
        this.soccer = soccer;
        this.soccer2 = soccer2;
        this.soccer3 = soccer3;
        this.image_team = image_team;
        this.image_team2 = image_team2;
        this.image_team3 = image_team3;
        this.vs_team = vs_team;
        this.vs_team2 = vs_team2;
        this.vs_team3 = vs_team3;
        this.isChecked = isChecked;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTeam() {
        return team;
    }

    @Override
    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam3() {
        return team3;
    }

    public void setTeam3(String team3) {
        this.team3 = team3;
    }

    public int getIcon_team() {
        return icon_team;
    }

    public void setIcon_team(int icon_team) {
        this.icon_team = icon_team;
    }

    public int getIcon_team2() {
        return icon_team2;
    }

    public void setIcon_team2(int icon_team2) {
        this.icon_team2 = icon_team2;
    }

    public int getIcon_team3() {
        return icon_team3;
    }

    public void setIcon_team3(int icon_team3) {
        this.icon_team3 = icon_team3;
    }

    public String getSoccer() {
        return soccer;
    }

    public void setSoccer(String soccer) {
        this.soccer = soccer;
    }

    public String getSoccer2() {
        return soccer2;
    }

    public void setSoccer2(String soccer2) {
        this.soccer2 = soccer2;
    }

    public String getSoccer3() {
        return soccer3;
    }

    public void setSoccer3(String soccer3) {
        this.soccer3 = soccer3;
    }

    public int getImage_team() {
        return image_team;
    }

    public void setImage_team(int image_team) {
        this.image_team = image_team;
    }

    public int getImage_team2() {
        return image_team2;
    }

    public void setImage_team2(int image_team2) {
        this.image_team2 = image_team2;
    }

    public int getImage_team3() {
        return image_team3;
    }

    public void setImage_team3(int image_team3) {
        this.image_team3 = image_team3;
    }

    public String getVs_team() {
        return vs_team;
    }

    public void setVs_team(String vs_team) {
        this.vs_team = vs_team;
    }

    public String getVs_team2() {
        return vs_team2;
    }

    public void setVs_team2(String vs_team2) {
        this.vs_team2 = vs_team2;
    }

    public String getVs_team3() {
        return vs_team3;
    }

    public void setVs_team3(String vs_team3) {
        this.vs_team3 = vs_team3;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
