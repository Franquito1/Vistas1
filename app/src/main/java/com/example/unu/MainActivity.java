package com.example.unu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button boton1;

    private EditText EditText1;

    private TextView text1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.textView);
        boton1=findViewById(R.id.button);
        EditText1=findViewById(R.id.editText);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int value = Integer.parseInt(EditText1.getText().toString());

                switch (value) {
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, ActivityMultiplicar.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, ActivityRestar.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        text1.setText("No es posible ingresar valores diferentes de 1, 2 y 3");
                        break;
                }

            }
        });
    }

}