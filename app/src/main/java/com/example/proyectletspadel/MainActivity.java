package com.example.proyectletspadel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnInicioSesion;
    Button btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnRegistro = findViewById(R.id.registro);
    btnInicioSesion = findViewById(R.id.IniciarSesion);


    btnRegistro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, PersonalLoggin.class);
                    startActivity(intent);


        }

    });

    btnInicioSesion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent( MainActivity.this,Main_login_activity.class);
            startActivity(intent);
        }
    });
    }



}

