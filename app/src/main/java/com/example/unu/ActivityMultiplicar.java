package com.example.unu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityMultiplicar extends AppCompatActivity {

    private TextView resultado;

    private Button boton;

    private Button boton1;

    private EditText num1;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        resultado=findViewById(R.id.resulFib);
        num1=findViewById(R.id.editTextFib);
        boton = findViewById(R.id.botonFib);
        this.boton1=findViewById(R.id.botonVolverFib);
        this.boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarPantalla();
            }
        });
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(num1.getText().toString());
                int resultado1 = fibonacci(numero);
                resultado.setText(String.valueOf(resultado1));
            }
        });
    }
    public void cambiarPantalla(){
        Intent uwu = new Intent(this,MainActivity.class);
        startActivity(uwu);
    }
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fibonacci = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fibonacci;
            fibonacci += prevFib;
            prevFib = temp;
        }
        return fibonacci;
    }

}