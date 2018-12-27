package com.example.proyectletspadel;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Invitacion extends AppCompatActivity {

    Button btnInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitacion);

        btnInicio = findViewById(R.id.volverInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Invitacion.this, StartActivity.class);
                startActivity(intent);
            }
        });
       /* ImageView img = findViewById(R.id.loadingView);
        img.setBackgroundResource(R.drawable.loading);

        AnimationDrawable animationFrame = (AnimationDrawable) img.getBackground();
        animationFrame.start();
        animationFrame.stop();*/
    }
}
