package com.example.proyectletspadel;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Main_login_activity extends AppCompatActivity {
    ImageButton IvFacebook;
    ImageButton IvGmail;
    ImageButton IvRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_activity);


        IvFacebook=findViewById(R.id.ivFacebook);
        IvGmail=findViewById(R.id.ivGmail);
        IvRegistro=findViewById(R.id.ivLogging);

        IvFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_login_activity.this,StartActivity.class);
                startActivity(intent);
                Toast toast = Toast.makeText(Main_login_activity.this, "Loggin con Facebook Correcto", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });

        IvGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_login_activity.this,StartActivity.class);
                startActivity(intent);


                Toast toast = Toast.makeText(Main_login_activity.this, "Loggin con Gmail Correcto", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });

        IvRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_login_activity.this,Login_Activity.class);
                startActivity(intent);
            }
        });

    }


}
