package com.geowind.hunong.entity;

/**
 * 农田分区
 * Created by Kui on 2016/7/20.
 */
public class FarmlandZone {

    //编号
    private String no;
    //面积
    private String area;
    //作物类型
    private String cropStyle;


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCropStyle() {
        return cropStyle;
    }

    public void setCropStyle(String cropStyle) {
        this.cropStyle = cropStyle;
    }

    @Override
    public String toString() {
        return "FarmlandZone{" +
                "no='" + no + '\'' +
                ", area='" + area + '\'' +
                ", cropStyle='" + cropStyle + '\'' +
                '}';
    }
}

