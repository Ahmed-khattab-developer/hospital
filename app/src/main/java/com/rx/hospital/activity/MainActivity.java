package com.rx.hospital.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rx.hospital.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.doctor).setOnClickListener(view -> {
            Intent intent = new Intent(this, AddDoctorActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.patient).setOnClickListener(view -> {
            Intent intent = new Intent(this, AddPatientActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.allDoctor).setOnClickListener(view -> {
            Intent intent = new Intent(this, DoctorsActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.allPatient).setOnClickListener(view -> {
            Intent intent = new Intent(this, PatientsActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.factory).setOnClickListener(view -> {
            Intent intent = new Intent(this, DoctorGradeActivity.class);
            startActivity(intent);
        });
    }
}