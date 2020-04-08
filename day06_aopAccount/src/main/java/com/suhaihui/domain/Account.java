package com.suhaihui.domain;

/**
 * @ClassName Account
 * @Description
 * @Author suhaihui
 * @Date 2020/3/10 15:51
 **/
public class Account {
    private int id;
    private String name;
    private float money;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
