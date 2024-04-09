package org.kamilastd.Entity;


import lombok.Getter;


@Getter
public enum SessionTypeEntity {
    BABY("Nowordkowa", 10, 700),
    PREGNANT("Ciążowa", 10, 500),
    FAMILY_CHILD_WOMEN("Rodzinna Dziecięca Kobieca", 10, 400),
    BIRTHDAY("Urodzinowa", 10, 400),
    WEEDING("Ślub", 0, 0),
    HOLY_BAPTISM("Chrzest", 0, 0),
    HOLY_COMMUNION("Komunia", 0, 0),
    MINI("Mini sesja", 0, 0);

    private String type;
    private int amount;
    private double price;

    SessionTypeEntity(String type, int amount, double price) {
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
