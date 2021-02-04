package com.ale.gttt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.util.Calendar;

public class AddSubjetActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnstarttime, btnendtime, btncancelar, btnguardar, btndls;
    private EditText etst,etet, etnombremateria;
    private Spinner spindia, spincolor;
    private int hour, minute;
    private ListView listdias;
    MediaPlayer pop, borrar, clic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subjet);
        Init();
    }

    private void Init() {
        btnstarttime= (Button) findViewById(R.id.btnstarttime);
        btnendtime= (Button) findViewById(R.id.btnendtime);
        etet=(EditText) findViewById(R.id.etet);
        etst=(EditText) findViewById(R.id.etst);
        btncancelar=(Button) findViewById(R.id.btncancelarmateria);
        btnguardar=(Button) findViewById(R.id.btnas);
        btndls=(Button) findViewById(R.id.btndls);
        etst=(EditText) findViewById(R.id.etst);
        etnombremateria=(EditText) findViewById(R.id.etnombremateria);
        spindia=  findViewById(R.id.spindia);
        spincolor=  findViewById(R.id.spincolor);
        listdias=  findViewById(R.id.listdias);

        Config();
    }

    public  void Config()
    {

        btnstarttime.setOnClickListener(this);
        btnendtime.setOnClickListener(this);
        pop=MediaPlayer.create(this, R.raw.pop);
        borrar=MediaPlayer.create(this, R.raw.borrar);
        clic=MediaPlayer.create(this, R.raw.clic);


    }

    @Override
    public void onClick(View v) {
        if(v==btnstarttime)
        {
            pop.start();
            final Calendar c= Calendar.getInstance();

            hour=c.get(Calendar.HOUR_OF_DAY);
            minute=c.get(Calendar.MINUTE);
            TimePickerDialog dialog= new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String st=hourOfDay+":"+minute;
                    etst.setText(st);
                }
            }, hour, minute, true);
            dialog.show();
        }
        if(v==btnendtime)
        {
            pop.start();
            final Calendar c= Calendar.getInstance();
            hour=c.get(Calendar.HOUR_OF_DAY);
            minute=c.get(Calendar.MINUTE);
            TimePickerDialog dialog= new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    String et=hourOfDay+":"+minute;
                    etet.setText(et);
                }
            }, hour, minute, true);
            dialog.show();
        }
        if (v==btnguardar){
            clic.start();
        }
        if (v==btncancelar){
            borrar.start();
        }
        if (v==btndls){
            pop.start();
        }
    }
}
