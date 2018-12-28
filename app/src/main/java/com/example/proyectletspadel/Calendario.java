package com.example.proyectletspadel;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class Calendario extends AppCompatActivity implements View.OnClickListener {

    Button BtnFecha;
    Button AceptarFecha;
    TextView TvFecha;

    private int dia, mes, anyo, hora, minuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        BtnFecha = (Button) findViewById(R.id.id_fecha);
        AceptarFecha = (Button) findViewById(R.id.acept_fecha);
        TvFecha = findViewById(R.id.TvFecha);
        BtnFecha.setOnClickListener(Calendario.this);
        //AceptarFecha.setOnClickListener(Calendario.this);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {

        if (v == BtnFecha) {
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            anyo = c.get(Calendar.YEAR);

        // he intentado sin exito poner la fecha actual.
            final DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    //datePickerDialog=null;

                    TvFecha.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                   // datePickerDialog.init(year, month, day, this);
                   // datePickerDialog.updateDate(year = 2019, monthOfYear = 1, dayOfMonth = 1);
                }

            }
                    , dia, mes, anyo);
            datePickerDialog.show();




            AceptarFecha.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Calendario.this, Invitacion.class);
                        startActivity(intent);
                    }
                });
            }
        }
    }


