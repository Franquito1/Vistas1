package com.example.unu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button botonVolver;


    private TextView resultado;

    private Button Operar;

    private EditText num1;

    private EditText num2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.botonVolver=findViewById(R.id.boton_volver);
        this.Operar=findViewById(R.id.boton_operar);
        this.num1=findViewById(R.id.editText1);
        this.num2=findViewById(R.id.editText2);
        resultado=findViewById(R.id.resulMult);
        this.botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V){
                cambiarPantalla();
            }
        });
        this.Operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num3 = Integer.parseInt(num1.getText().toString());
                int num4 = Integer.parseInt(num2.getText().toString());
                int resultado1 = num3 * num4;
                resultado.setText(String.valueOf(resultado1));
            }
        });
    }
    public void cambiarPantalla(){
        Intent uwu = new Intent(this,MainActivity.class);
        startActivity(uwu);
    }
}

