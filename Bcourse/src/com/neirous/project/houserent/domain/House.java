package com.neirous.project.houserent.domain;

/**
 * House的对象表示一个房屋信息
 */
public class House {
    //编号  房主  电话   地址   月租  状态（是否出租）
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String state;

    public House(int id, String name, String phone, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    //为了方便输出对象信息，重写toString

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + phone + "\t" + address + "\t" + rent + "\t" + state;
    }
}
