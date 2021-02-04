package com.ale.gttt.entities;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")

    private Integer id;
    @SerializedName("nick")

    private String nick;
    @SerializedName("email")

    private String email;
    @SerializedName("img")

    private String img;
    @SerializedName("password")

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}