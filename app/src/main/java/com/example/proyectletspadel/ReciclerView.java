package com.example.proyectletspadel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class ReciclerView extends AppCompatActivity {

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
    }

    private ArrayList<Item> GetListItems(){

        ArrayList<Item> ListItems = new ArrayList<>();

        ListItems.add(new Item (R.drawable.ic_person_add, "Carlos masc en badalona", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Jose mixto en cornella", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "Sara Fem en Santa Coloma", "PArtida nivel C faltan 2 palas"));
        ListItems.add(new Item (R.drawable.ic_person_add, "David masc en el Prat", "PArtida nivel C faltan 2 palas"));

        return ListItems;
    }
}
