package com.example.ejercicio3u2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {
    EditText resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        resultado=findViewById(R.id.edittextResultado);

    }
   public void Resultado(View v){
        resultado.setText("Tu calificacion es: "+Nota.calificacion+"");

}
}