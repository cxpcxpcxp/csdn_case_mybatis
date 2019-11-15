package com.one2one.domain;

import java.io.Serializable;

public class Card implements Serializable {
    private int id;
    private int uid;
    private long cardnum;

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

    public long getCardnum() {
        return cardnum;
    }

    public void setCardnum(long cardnum) {
        this.cardnum = cardnum;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", uid=" + uid +
                ", cardnum=" + cardnum +
                '}';
    }
}
