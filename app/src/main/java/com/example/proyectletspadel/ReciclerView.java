package com.example.proyectletspadel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ReciclerView extends AppCompatActivity {

    FloatingActionButton btonFloat;
    private RecyclerView reciclerview;
    private Adapter adapter;
    private  RecyclerView.LayoutManager manager;


    protected void onCreate (Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reciclerview);
        reciclerview= findViewById(R.id.id_recycleview);
        manager= new LinearLayoutManager(this);
        reciclerview.setLayoutManager(manager);


        adapter = new Adapter(this, GetListItems());
        reciclerview.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Partida selecionada.", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
                Intent intent = new Intent(ReciclerView.this, Invitacion.class);
                startActivity(intent);

            }
        });


    }

    private ArrayList<Item> GetListItems(){

        ArrayList<Item> ListItems = new ArrayList<>();

        ListItems.add(new Item (R.drawable.ic_person_add, "Carlos masc en Badalona", "Partida nivel A faltan 3 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Jose mixto en Cornella", "Partida nivel B faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Sara Fem en Santa Coloma", "Partida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Julio masc en el Prat", "Partida nivel C faltan 3 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Javier masc en Horta", "Partida nivel B faltan 1 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Juan mixto en Esplugues", "Partida nivel A faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Sarai Fem en Sants", "Partida nivel B faltan 1 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Pedro mixto en Ripollet", "Partida nivel B faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Carlos masc en Badalona", "Partida nivel A faltan 3 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Jose mixto en Cornella", "Partida nivel B faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Sara Fem en Santa Coloma", "Partida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Julio masc en el Prat", "Partida nivel C faltan 3 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Javier masc en Horta", "Partida nivel B faltan 1 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Juan mixto en Esplugues", "Partida nivel A faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Sarai Fem en Sants", "Partida nivel B faltan 1 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Pedro mixto en Ripollet", "Partida nivel B faltan 2 palas"));
        return ListItems;
    }


}
