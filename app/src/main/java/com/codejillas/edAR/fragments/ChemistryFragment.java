package com.codejillas.edAR.fragments;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codejillas.edAR.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ChemistryFragment extends Fragment {

    MaterialCardView SF6button;
    MaterialCardView C2H4button;
    ExtendedFloatingActionButton Titration;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subject_chemistry,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SF6button=view.findViewById(R.id.inorganic_sf6);
        C2H4button=view.findViewById(R.id.organic_c2h4);
        Titration=view.findViewById(R.id.titration);
        SF6button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(getActivity().getPackageManager().getLaunchIntentForPackage("com.codejillas.ar.sceneform.chemistry.sf"));
            }
        });
        C2H4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(getActivity().getPackageManager().getLaunchIntentForPackage("com.codejillas.ar.sceneform.chemistry.ethene"));
            }
        });
        Titration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(getActivity().getPackageManager().getLaunchIntentForPackage("com.google.ar.core.examples.unity.augmentedimage"));
            }
        });
    }
}
