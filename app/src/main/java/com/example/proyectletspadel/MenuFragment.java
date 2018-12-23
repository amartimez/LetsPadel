package com.example.proyectletspadel;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MenuFragment extends Fragment {


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Palas activity = (Palas) getActivity();
        return inflater.inflate(R.layout.fragment_menu, container, false);




        }

   /* public boolean onNavigation (MenuItem item_id){

       / FragmentManager FragmentManager = getSupportFragmentManager();

        int id = item_id.getItemId();

        if (id == R.id.busca_Partida) {

            FragmentManager.beginTransaction().replace(R.id.contenedor,new AyudaFragment()).commit();

        }*/
    }
