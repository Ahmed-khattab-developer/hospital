package com.rx.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import android.os.Bundle;
import android.widget.Toast;

public class AddPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient);

        AppCompatEditText name = findViewById(R.id.name);
        AppCompatEditText gender = findViewById(R.id.gender);
        AppCompatEditText phone = findViewById(R.id.phone);
        AppCompatEditText email = findViewById(R.id.email);
        AppCompatEditText password = findViewById(R.id.password);
        AppCompatEditText address = findViewById(R.id.address);
        AppCompatEditText disease = findViewById(R.id.disease);
        AppCompatEditText ray = findViewById(R.id.ray);

        findViewById(R.id.patient).setOnClickListener(view -> {
            Patient patient = new Patient();
            patient.setName(name.getText().toString());
            patient.setGender(gender.getText().toString());
            patient.setPhone(phone.getText().toString());
            patient.setEmail(email.getText().toString());
            patient.setPassword(password.getText().toString());
            patient.setHomeAdderss(new Address(address.getText().toString(), "", "", "", ""));
            patient.setPassword(password.getText().toString());
            Disease disease1 =new Disease(disease.getText().toString(),"");
            patient.setDisease(disease1);
            Ray ray1 =new Ray(ray.getText().toString());
            patient.setRay(ray1);

            Toast.makeText(this, "Add Patient Successfully", Toast.LENGTH_SHORT).show();
        });
    }
}