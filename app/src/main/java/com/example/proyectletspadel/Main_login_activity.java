package com.example.proyectletspadel;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;
import android.widget.ImageView;

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
            }
        });

        IvGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_login_activity.this,StartActivity.class);
                startActivity(intent);
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
