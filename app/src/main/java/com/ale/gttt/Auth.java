package com.ale.gttt;

import com.ale.gttt.entities.Security;
import com.ale.gttt.entities.User;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Auth {

    @POST("security")
Call<Security> login(@Body  Login l);

    @GET("token")
    Call<ResponseBody> getSecret(@Header("Authorization") String authToken);

}
