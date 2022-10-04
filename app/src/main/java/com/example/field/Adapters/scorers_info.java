package com.example.field.Adapters;

public class scorers_info {

    private  String name;
    private  String team;
    private  String score;
    private   int profile;
    private    int pic;

    public scorers_info() {
    }

    public scorers_info(String name, String team, String score, int profile, int pic) {
        this.name = name;
        this.team = team;
        this.score = score;
        this.profile = profile;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getScore() {
        return score;
    }

    public int getProfile() {
        return profile;
    }

    public int getPic() {
        return pic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
