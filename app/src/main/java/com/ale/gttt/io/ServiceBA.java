package com.ale.gttt.io;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public final class ServiceBA {
     public static final String BASE_URL= "http://10.0.2.2:80/";
     private static  ServiceBA intance;
     private Retrofit retrofit;
     private HttpLoggingInterceptor loggingInterceptor;
     private OkHttpClient.Builder httpClientBuilder;

     private ServiceBA()  {
          loggingInterceptor= new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
          httpClientBuilder= new OkHttpClient.Builder().addInterceptor(loggingInterceptor)
                  .connectTimeout(200, TimeUnit.SECONDS)
                  .writeTimeout(200, TimeUnit.SECONDS)
                  .readTimeout(200, TimeUnit.SECONDS);


          retrofit= new Retrofit.Builder()
                  .baseUrl(BASE_URL)
                  .addConverterFactory(GsonConverterFactory.create())
                  .build();

     }
     public static  synchronized ServiceBA getInstance() throws Exception {
          if (intance==null){
               intance= new ServiceBA();}

          return intance;
     }
     public <S> S createService(Class<S> serviceClass){
          return  retrofit.create(serviceClass);
     }



}
