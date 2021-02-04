package com.ale.gttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ale.gttt.entities.User;
import com.ale.gttt.io.ISUser;
import com.ale.gttt.io.ServiceBA;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Main2Activity extends AppCompatActivity {
private Button  btnaceptaringreso, btncrearcuenta;
MediaPlayer mp, intro;

    private Auth _auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intro=MediaPlayer.create(this, R.raw.intro);
        intro.start();
        Init();
        try {
            callServiceGetAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void iniciar(int q){
        if (q==0){
            Intent i= new Intent(this, MenuTabActivity.class);
            startActivity(i);
        }
        if(q==1){
            Intent i= new Intent(this, SingUpActivity.class);
            startActivity(i);
        }

    }
    protected void Init(){
        mp= MediaPlayer.create(this, R.raw.clic);
        btnaceptaringreso=findViewById(R.id.btnaceptaringreso);
        btncrearcuenta=findViewById(R.id.btncrearcuenta);

        btncrearcuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                try {
                    callServiceGetAll();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        btnaceptaringreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                iniciar(0);
            }
        });
    }

    private void callServiceGetAll() throws Exception {

        Call<List<User>> call= ServiceBA
                .getInstance()
                .createService(ISUser.class)
                .getAll();
            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    if (response.code()==200){
                        Log.d("oa", "si");
                    }else if (response.code()==204){
                        Log.d("oa", "no hay");
                    }else {
                        Log.d("oa", "lastima");
                    }
                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {
                    Log.d("no", "nooooo "+t.getMessage());
                }
            });


    }

    public void Click(){
        mp.start();
    }



}
