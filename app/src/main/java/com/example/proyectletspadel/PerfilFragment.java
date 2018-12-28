package com.example.proyectletspadel;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class PerfilFragment extends Fragment {
ImageButton btnPerfil;

public PerfilFragment(){}



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_perfil, container, false);


        btnPerfil = rootView.findViewById(R.id.btnPerfil);


        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData3();
            }
        });

        return rootView;
    }


    private void sendData3()
    {
        //INTENT OBJ
        Intent i = new Intent(getActivity().getBaseContext(),
                Profile.class);

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

