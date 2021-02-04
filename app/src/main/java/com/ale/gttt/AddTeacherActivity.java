package com.ale.gttt;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddTeacherActivity extends AppCompatActivity implements View.OnClickListener{
private Button btnaddst,btnguardardocenteedicion, btncancelardocenteedicion;
private EditText etnuevodocentenombre, etnuevodocentealias, etnuevodocentetelefono, etnuevodocenteemail, etnuevodocenteapellido, etast;
private TextView tvdicta;
    MediaPlayer pop, borrar, clic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_teacher);
        Init();
    }
    private  void  Init(){
        btnaddst= findViewById(R.id.btnaddst);

        btncancelardocenteedicion= findViewById(R.id.btncancelardocenteedicion);
        btnguardardocenteedicion= findViewById(R.id.btnguardardocenteedicion);


        pop= MediaPlayer.create(this, R.raw.pop);
        borrar=MediaPlayer.create(this, R.raw.borrar);
        clic=MediaPlayer.create(this, R.raw.clic);

        Config();
    }

    private void Config() {
        btnguardardocenteedicion.setOnClickListener(this);
        btncancelardocenteedicion.setOnClickListener(this);
        btnaddst.setOnClickListener(this);

    }

    public void onClick(View v){
        if(v==btnaddst ){
            pop.start();
        }
        if (v==btnguardardocenteedicion){
            clic.start();
        }
        if (v==btncancelardocenteedicion){
            borrar.start();
        }
    }

}
