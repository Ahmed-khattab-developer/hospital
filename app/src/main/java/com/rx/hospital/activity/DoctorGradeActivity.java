package com.rx.hospital.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.rx.hospital.R;
import com.rx.hospital.factory.GradeFactory;
import com.rx.hospital.model.DegreeFactory;

public class DoctorGradeActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_grade);

        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener((radioGroup, i) -> {
            RadioButton radioButton = findViewById(i);

            GradeFactory breadFactory = new GradeFactory();
            DegreeFactory bread = breadFactory.getGrade(radioButton.getText().toString());

            Toast.makeText(DoctorGradeActivity.this,radioButton.getText().toString() , Toast.LENGTH_SHORT).show();
        });




    }
}