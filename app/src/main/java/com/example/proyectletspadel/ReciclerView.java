package com.example.proyectletspadel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ReciclerView extends AppCompatActivity {
    FloatingActionButton btonFloat;

    private RecyclerView reciclerview;
    private Adapter adapter;
    private  RecyclerView.LayoutManager manager;

    protected void onCreate (Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_reciclerview);
        btonFloat= findViewById(R.id.btonFloat);
        reciclerview= findViewById(R.id.id_recycleview);
        manager= new LinearLayoutManager(this);
        reciclerview.setLayoutManager(manager);


        adapter = new Adapter(this, GetListItems());
        reciclerview.setAdapter(adapter);

        btonFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReciclerView.this, Invitacion.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<Item> GetListItems(){

        ArrayList<Item> ListItems = new ArrayList<>();

        ListItems.add(new Item (R.drawable.ic_person_add, "Carlos masc en badalona", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Jose mixto en cornella", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Sara Fem en Santa Coloma", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "David masc en el Prat", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Carlos masc en badalona", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Jose mixto en cornella", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Sara Fem en Santa Coloma", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "David masc en el Prat", "PArtida nivel C faltan 2 palas"));
        return ListItems;
    }


}
