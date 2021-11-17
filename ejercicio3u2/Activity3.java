package com.example.ejercicio3u2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    TextView pregunta;
    RadioButton respuesta1;
    RadioButton respuesta2;
    RadioButton respuesta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        pregunta=findViewById(R.id.textViewPregunta3);
        respuesta1=findViewById(R.id.radioButtonP3R1);
        respuesta2=findViewById(R.id.radioButtonP3R2);
        respuesta3=findViewById(R.id.radioButtonP3R3);
    }
    public void Siguiente (View v){
        if(respuesta1.isChecked()==false && respuesta2.isChecked()==false && respuesta3.isChecked()==false){
            Toast.makeText(this, "DEBE ELEGIR UNA OPCION", Toast.LENGTH_SHORT).show();
        }else if(respuesta3.isChecked()){
            Nota.calificacion=Nota.calificacion+2;

            Intent siguiente = new Intent(this, Activity4.class);
            startActivity(siguiente);

        }else if(respuesta1.isChecked()){
            Nota.calificacion=Nota.calificacion+0;

            Intent siguiente = new Intent(this, Activity4.class);
            startActivity(siguiente);

        }else if(respuesta2.isChecked()){
            Nota.calificacion=Nota.calificacion+0;
            Intent siguiente = new Intent(this, Activity4.class);
            startActivity(siguiente);
        }

    }
}