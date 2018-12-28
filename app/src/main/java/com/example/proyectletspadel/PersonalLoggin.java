package com.example.proyectletspadel;


import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.parse.Parse;
import com.parse.ParseInstallation;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;

public class PersonalLoggin extends AppCompatActivity {
   Button btnAceptar;
   Button btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Parse.initialize(new Parse.Configuration.Builder(this)

                .applicationId(getString(R.string.back4app_app_id))
                // if defined
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()


        );
        ParseInstallation.getCurrentInstallation().saveInBackground();
        Toast.makeText(PersonalLoggin.this,"Solo te llevará 15 segundos!! :)", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_personal_loggin);
        final EditText userTxt;
        final EditText PasswordTxt;


        btnAceptar= findViewById(R.id.buttonAceptar);
        btnCancelar= findViewById(R.id.buttonCandelar);
        userTxt = findViewById(R.id.PersonalUsuario);
        PasswordTxt = findViewById(R.id.PersonalContraseña);


        ParseUser user = new ParseUser();
// Set the user's username and password, which can be obtained by a forms
        user.setUsername(String.valueOf(userTxt));
        user.setPassword(String.valueOf(PasswordTxt));
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                   // Toast.makeText(PersonalLoggin.this,"Solo te llevará 15 segundos!! :)", Toast.LENGTH_LONG).show();
                } else {
                    ParseUser.logOut();
                    Toast.makeText(PersonalLoggin.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(PersonalLoggin.this,Profile.class);
                startActivity(intent2);
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(PersonalLoggin.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
