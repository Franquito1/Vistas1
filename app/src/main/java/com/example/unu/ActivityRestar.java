package com.example.unu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityRestar extends AppCompatActivity {
    Button CalcularBoton;

    private Button botonVolver;
    private EditText text1;
    private EditText text2;
    private TextView resultado1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);

        text1=findViewById(R.id.editText1);
        text2=findViewById(R.id.editText2);
        resultado1=findViewById(R.id.resul_pot);
        botonVolver=findViewById(R.id.botonVolver1);
        CalcularBoton=findViewById(R.id.boton_pot);
        CalcularBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double base = Double.parseDouble(text1.getText().toString());
                double exponent = Double.parseDouble(text2.getText().toString());
                double resultado= Math.pow(base, exponent);
                resultado1.setText(String.valueOf(resultado));
            }
        });
        this.botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                cambiarPantalla();
            }
        });
    }
    public void cambiarPantalla(){
        Intent uwu = new Intent(this,MainActivity.class);
        startActivity(uwu);
    }
}