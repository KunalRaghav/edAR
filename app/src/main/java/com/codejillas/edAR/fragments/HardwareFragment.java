package com.codejillas.edAR.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codejillas.edAR.R;
import com.google.android.material.card.MaterialCardView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HardwareFragment extends Fragment {

    MaterialCardView ArMegaButton;
    MaterialCardView ArUnoButton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subject_hardware,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArMegaButton=view.findViewById(R.id.arduinomega);
        ArMegaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(getActivity().getPackageManager().getLaunchIntentForPackage("com.codejillas.ar.sceneform.hardware.arduinomega"));
            }
        });
        ArUnoButton=view.findViewById(R.id.arduinouno);
        ArUnoButton.setVisibility(View.GONE);
    }
}
