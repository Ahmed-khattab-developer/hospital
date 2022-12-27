package com.rx.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        AppCompatEditText name = findViewById(R.id.name);
        AppCompatEditText gender = findViewById(R.id.gender);
        AppCompatEditText phone = findViewById(R.id.phone);
        AppCompatEditText email = findViewById(R.id.email);
        AppCompatEditText password = findViewById(R.id.password);
        AppCompatEditText address = findViewById(R.id.address);
        AppCompatEditText speciality = findViewById(R.id.speciality);
        AppCompatEditText degree = findViewById(R.id.degree);

        findViewById(R.id.doctor).setOnClickListener(view -> {
            Doctor doctor = new Doctor();
            doctor.setName(name.getText().toString());
            doctor.setGender(gender.getText().toString());
            doctor.setPhone(phone.getText().toString());
            doctor.setEmail(email.getText().toString());
            doctor.setPassword(password.getText().toString());
            doctor.setHomeAdderss(new Address(address.getText().toString(), "", "", "", ""));
            doctor.setPassword(password.getText().toString());
            doctor.setSpeciality(speciality.getText().toString());
            doctor.setDegrees(degree.getText().toString());

            Toast.makeText(this, "Add Doctor Successfully", Toast.LENGTH_SHORT).show();

        });
    }
}