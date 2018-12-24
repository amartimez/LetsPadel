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

    private Button BtnBuscarPartida;
    private Button BtnoNuevaPartida;

    public MenuFragment(){


    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_menu, container, false);

        BtnBuscarPartida= rootView.findViewById(R.id.busca_Partida);
        BtnoNuevaPartida= rootView.findViewById(R.id.crea_Partida);
       // return inflater.inflate(R.layout.fragment_menu, container, false);


        BtnBuscarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

        BtnoNuevaPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData2();
            }
        });

        return rootView;


        }

    private void sendData()
    {
        //INTENT OBJ
        Intent i = new Intent(getActivity().getBaseContext(),
                Calendario.class);

        //PACK DATA
      /*  i.putExtra("SENDER_KEY", "MyFragment");
        i.putExtra("NAME_KEY", nameFragTxt.getText().toString());
        i.putExtra("YEAR_KEY", Integer.valueOf(launchYearSpinner.getSelectedItem().toString()));*/

        //RESET WIDGETS
       // nameFragTxt.setText("");
        //launchYearSpinner.setSelection(0);

        //START ACTIVITY
        getActivity().startActivity(i);
    }

    private void sendData2()
    {
        //INTENT OBJ
        Intent i = new Intent(getActivity().getBaseContext(),
                Palas.class);

        //PACK DATA
      /*  i.putExtra("SENDER_KEY", "MyFragment");
        i.putExtra("NAME_KEY", nameFragTxt.getText().toString());
        i.putExtra("YEAR_KEY", Integer.valueOf(launchYearSpinner.getSelectedItem().toString()));*/

        //RESET WIDGETS
        // nameFragTxt.setText("");
        //launchYearSpinner.setSelection(0);

        //START ACTIVITY
        getActivity().startActivity(i);
    }

    }
