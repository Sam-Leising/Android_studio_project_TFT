package com.example.p.model;

public class Champions_UserData {

    String userName;
    Integer imageUrl;
    Integer item1,item2,item3;
    String cost,health,mana,armor,mr,dps,damage,atk_spd,crit_rate,range;

    public Champions_UserData(String userName, Integer imageUrl, Integer item1, Integer item2, Integer item3, String cost, String health, String mana, String armor, String mr, String dps, String damage, String atk_spd, String crit_rate, String range) {
        this.userName = userName;
        this.imageUrl = imageUrl;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.cost = cost;
        this.health = health;
        this.mana = mana;
        this.armor = armor;
        this.mr = mr;
        this.dps = dps;
        this.damage = damage;
        this.atk_spd = atk_spd;
        this.crit_rate = crit_rate;
        this.range = range;
    }




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getItem1() {
        return item1;
    }

    public void setItem1(Integer item1) {
        this.item1 = item1;
    }

    public Integer getItem2() {
        return item2;
    }

    public void setItem2(Integer item2) {
        this.item2 = item2;
    }

    public Integer getItem3() {
        return item3;
    }

    public void setItem3(Integer item3) {
        this.item3 = item3;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public String getDps() {
        return dps;
    }

    public void setDps(String dps) {
        this.dps = dps;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getAtk_spd() {
        return atk_spd;
    }

    public void setAtk_spd(String atk_spd) {
        this.atk_spd = atk_spd;
    }

    public String getCrit_rate() {
        return crit_rate;
    }

    public void setCrit_rate(String crit_rate) {
        this.crit_rate = crit_rate;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }


}
