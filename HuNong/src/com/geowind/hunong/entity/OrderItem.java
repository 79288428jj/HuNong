package com.geowind.hunong.entity;

/**
 * 订单项实体
 * Created by Jiang 2016/7/20.
 */
public class OrderItem {
    //订单项编号
    private String no;
    //农资编号
    private String rno;
    //数量
    private int num;
    //订单总价
    private double totalprice;
    //订单号
    private String orderNo;

    //无参构造函数
    public OrderItem(){

    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }


    @Override
    public String toString() {
        return "OrderItem{" +
                "no='" + no + '\'' +
                ", rno='" + rno + '\'' +
                ", num=" + num +
                ", totalprice=" + totalprice +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
