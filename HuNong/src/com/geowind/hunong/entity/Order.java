package com.geowind.hunong.entity;

import java.util.Date;

/**
 * 订单实体
 * Created by Jiang on 2016/7/20.
 */
public class Order {
    //订单号
    private String no;
    //农资商
    private String raderNo;
    //订单日期
    private Date date;
    //订单总价
    private double totalPrice;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRaderNo() {
        return raderNo;
    }

    public void setRaderNo(String raderNo) {
        this.raderNo = raderNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "no='" + no + '\'' +
                ", raderNo='" + raderNo + '\'' +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
