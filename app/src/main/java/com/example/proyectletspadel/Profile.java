package com.example.proyectletspadel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    ImageButton IvFoto;
    Button btnEnviar;
    RadioGroup grupo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        IvFoto= findViewById(R.id.imageAdd);



        grupo = (RadioGroup) findViewById(R.id.opcionesJuego);
        btnEnviar= findViewById(R.id.buttonEnviar);

        IvFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(IvFoto.isSelected());
                Toast toast = Toast.makeText(Profile.this, "Simulación abrir camara para hacer foto", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,StartActivity.class);
                startActivity(intent);

            }
        });
    }

    public void comprobarPreferenciasJuego(View view) {
        if (grupo.getCheckedRadioButtonId() == R.id.radioDerecha) {
            final String text = "Preferencia de juego Derecha";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
        if ( grupo.getCheckedRadioButtonId()==R.id.radioReves){

            final String text = "Preferencia de juego Izquierda";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }

        else{

        }
    }




}
