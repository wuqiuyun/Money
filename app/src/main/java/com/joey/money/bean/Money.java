package com.joey.money.bean;

/**
 * Money实体类
 * Created by ASUS on 2017/8/20.
 */

public class Money {
    private int picId;
    private String name;

    public Money(int picId, String name) {
        this.picId = picId;
        this.name = name;
    }

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Money{" +
                "picId=" + picId +
                ", name='" + name + '\'' +
                '}';
    }
}
