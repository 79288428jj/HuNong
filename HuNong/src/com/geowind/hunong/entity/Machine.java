package com.geowind.hunong.entity;

/**
 * Created by Kui on 2016/7/20.
 */
public class Machine {
    //编号
    private String no;
    //牌号
    private String plate;
    //类型
    private String style;
    //品牌
    private String brand;
    //马力
    private int hp;
    //使用年限
    private int usertime;
    //实物图
    private String picUrl;
    //拥有者编号
    private char ono;
    //状态
    private char state;
    //工作状态
    private char workstate;

    public Machine(String no) {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getUsertime() {
        return usertime;
    }

    public void setUsertime(int usertime) {
        this.usertime = usertime;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public char getOno() {
        return ono;
    }

    public void setOno(char ono) {
        this.ono = ono;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public char getWorkstate() {
        return workstate;
    }

    public void setWorkstate(char workstate) {
        this.workstate = workstate;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "no='" + no + '\'' +
                ", plate='" + plate + '\'' +
                ", style='" + style + '\'' +
                ", brand='" + brand + '\'' +
                ", hp=" + hp +
                ", usertime=" + usertime +
                ", picUrl='" + picUrl + '\'' +
                ", ono=" + ono +
                ", state=" + state +
                ", workstate=" + workstate +
                '}';
    }
}
