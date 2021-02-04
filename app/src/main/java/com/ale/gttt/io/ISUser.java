package com.ale.gttt.io;

import com.ale.gttt.entities.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ISUser {
    @GET("Gapi/api/user")
    Call<List<User>> getAll();
}
