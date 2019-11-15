package com.more2one.domain;

import java.io.Serializable;

public class Accounts implements Serializable {
    private int id;
    private int uid;
    private double money;
    private Usersss usersss;

    public Usersss getUsersss() {
        return usersss;
    }

    public void setUsersss(Usersss usersss) {
        this.usersss = usersss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", usersss=" + ((usersss!=null)?usersss.toString():null) +
                '}';
    }
}
