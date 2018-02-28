package com.lipeng.bean;

/**
 * Created by dllo on 18/2/27.
 */
public class Blog {
    private Integer id;
    private String title;
    private String desc;
    private String content;
    private Integer userId;

    public Blog(){
    }

    public Blog(String title, String desc, String content, Integer userId) {
        this.title = title;
        this.desc = desc;
        this.content = content;
        this.userId = userId;
    }

    public Blog(Integer id, String title, String desc, String content, Integer userId) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.content = content;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
