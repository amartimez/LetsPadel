package com.example.proyectletspadel;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robertlevonyan.views.chip.Chip;
import com.robertlevonyan.views.chip.OnChipClickListener;

import java.util.ArrayList;


public class PartidasFragment extends Fragment {
    Chip chip;

    public PartidasFragment() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_partidas, container, false);

        chip = rootView.findViewById(R.id.chipPartidas);

        // return inflater.inflate(R.layout.fragment_menu, container, false);

        chip.setOnChipClickListener(new OnChipClickListener() {
            @Override
            public void onChipClick(View v) {
                sendData();
            }
        });


        return rootView;

    }

    private void sendData() {
        //INTENT OBJ
        Intent i = new Intent(getActivity().getBaseContext(),
                StartActivity.class);

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