package com.lipeng.bean;

/**
 * Created by dllo on 18/2/26.
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private Integer level;
    private String desc;
    private String tel;
    private String address;

    public User(){
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public User(String name, String pwd,  String desc, String tel, String address) {
        this.name = name;
        this.pwd = pwd;
        this.desc = desc;
        this.tel = tel;
        this.address = address;
    }

    public User(Integer id, String name, String pwd, Integer level, String desc, String tel, String address) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.level = level;
        this.desc = desc;
        this.tel = tel;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", level=" + level +
                ", desc='" + desc + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
