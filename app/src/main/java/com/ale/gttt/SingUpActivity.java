package com.ale.gttt;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingUpActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnaceptarregistro, btncancelarregistro;
MediaPlayer clic, add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
    }
    private void Init(){
        clic=MediaPlayer.create(this, R.raw.clic);
        add=MediaPlayer.create(this, R.raw.add);
        btncancelarregistro=findViewById(R.id.btncancelarregistro);
        btnaceptarregistro=findViewById(R.id.btnaceptarregistro);
        btnaceptarregistro.setOnClickListener(this);
        btncancelarregistro.setOnClickListener(this);

    }
    public void onClick(View v){
        if (v==btnaceptarregistro){
            clic.start();
        }
        if (v==btncancelarregistro){
            add.start();
        }
    }
}
