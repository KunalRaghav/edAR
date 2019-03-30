package com.codejillas.edAR.acitivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.codejillas.edAR.R;

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
    }
}
