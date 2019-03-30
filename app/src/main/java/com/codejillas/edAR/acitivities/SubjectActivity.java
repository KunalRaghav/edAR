package com.codejillas.edAR.acitivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.codejillas.edAR.R;
import com.codejillas.edAR.fragments.BiologyFragment;
import com.codejillas.edAR.fragments.ChemistryFragment;
import com.codejillas.edAR.fragments.EnglishFragment;
import com.codejillas.edAR.fragments.MathsFragment;
import com.codejillas.edAR.fragments.PhysicsFragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubjectActivity extends AppCompatActivity {

    TextView subjectName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        Intent intent = getIntent();
        subjectName=findViewById(R.id.subject_name);
        subjectName.setText(intent.getStringExtra("subject"));
        switch (intent.getStringExtra("subject")){
            case "chemistry":
                ChemistryFragment fragment = new ChemistryFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.container_subject,fragment,"chemFrag").commit();
                break;
            case "english":
                EnglishFragment englishFragment= new EnglishFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.container_subject,englishFragment,"engFrag").commit();
                break;
            case "math":
                MathsFragment mathsFragment = new MathsFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.container_subject,mathsFragment,"mathFrag").commit();
                break;
            case "physics":
                PhysicsFragment physicsFragment = new PhysicsFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.container_subject,physicsFragment,"phyFrag").commit();
                break;
            case "biology":
                BiologyFragment biologyFragment = new BiologyFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.container_subject,biologyFragment,"bioFrag").commit();
                break;
        }
    }
}
