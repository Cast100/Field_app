package com.example.field.Adapters;

public class table_info {

    private String position;
    private String team;
    private String PI;
    private String w;
    private String d;
    private String l;
    private String df;
    private String gd;
    private String pts;
    private int Img;

    public table_info() {
    }

    public table_info(String position, String team, String PI, String w, String d, String l, String df, String gd, String pts, int img) {
        this.position = position;
        this.team = team;
        this.PI = PI;
        this.w = w;
        this.d = d;
        this.l = l;
        this.df = df;
        this.gd = gd;
        this.pts = pts;
        Img = img;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public String getPI() {
        return PI;
    }

    public String getW() {
        return w;
    }

    public String getD() {
        return d;
    }

    public String getL() {
        return l;
    }

    public String getDf() {
        return df;
    }

    public String getGd() {
        return gd;
    }

    public String getPts() {
        return pts;
    }

    public int getImg() {
        return Img;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPI(String PI) {
        this.PI = PI;
    }

    public void setW(String w) {
        this.w = w;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void setL(String l) {
        this.l = l;
    }

    public void setDf(String df) {
        this.df = df;
    }

    public void setGd(String gd) {
        this.gd = gd;
    }

    public void setPts(String pts) {
        this.pts = pts;
    }

    public void setImg(int img) {
        Img = img;
    }
}
