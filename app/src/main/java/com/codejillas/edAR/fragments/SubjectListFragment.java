package com.codejillas.edAR.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.codejillas.edAR.R;
import com.codejillas.edAR.acitivities.SubjectActivity;
import com.google.android.material.card.MaterialCardView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SubjectListFragment extends Fragment {
    MaterialCardView ChemCard;
    MaterialCardView MathCard;
    MaterialCardView EngCard;
    MaterialCardView PhyCard;
    MaterialCardView BioCard;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subjectlist,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ChemCard=view.findViewById(R.id.subjectlist_chem);
        MathCard=view.findViewById(R.id.subjectlist_math);
        EngCard=view.findViewById(R.id.subjectlist_eng);
        PhyCard=view.findViewById(R.id.subjectlist_Physics);
        BioCard=view.findViewById(R.id.subjectlist_biology);

        ChemCard.setOnClickListener(CardOnClick);
        MathCard.setOnClickListener(CardOnClick);
        EngCard.setOnClickListener(CardOnClick);
        PhyCard.setOnClickListener(CardOnClick);
        BioCard.setOnClickListener(CardOnClick);
    }

    View.OnClickListener CardOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), SubjectActivity.class);
            switch (v.getId()){
                case R.id.subjectlist_chem:
                    intent.putExtra("subject","chemistry");
                    break;
                case R.id.subjectlist_eng:
                    intent.putExtra("subject","english");
                    break;
                case R.id.subjectlist_math:
                    intent.putExtra("subject","math");
                    break;
                case R.id.subjectlist_Physics:
                    intent.putExtra("subject","physics");
                    break;
                case R.id.subjectlist_biology:
                    intent.putExtra("subject","biology");
                    break;

            }
            Toast.makeText(getContext(),"Opening Subject",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    };
}
