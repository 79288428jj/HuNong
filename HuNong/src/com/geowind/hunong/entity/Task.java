package com.geowind.hunong.entity;

import java.util.Date;

/**
 * 任务实体类
 * Created by Jiang on 2016/7/20.
 */
public class Task {
    //任务编号
    private String no;
    //农机手编号
    private String name;
    //农田编号
    private String fno;
    //工作量
    private int workLoad;
    //农机编号
    private String mno;
    //作业类型
    private char workStyle;
    //日期
    private Date date;

    // 无参构造函数
    public Task(){

    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public char getWorkStyle() {
        return workStyle;
    }

    public void setWorkStyle(char workStyle) {
        this.workStyle = workStyle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", fno='" + fno + '\'' +
                ", workLoad=" + workLoad +
                ", mno='" + mno + '\'' +
                ", workStyle=" + workStyle +
                ", date=" + date +
                '}';
    }
}
