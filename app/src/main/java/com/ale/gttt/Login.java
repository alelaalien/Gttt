package com.ale.gttt;

import com.google.gson.annotations.SerializedName;

public class Login {


    private String user ;

    private String password;
    public  Login(String pass, String name){
        this.password=pass;
        this.user=name;
    }
}
