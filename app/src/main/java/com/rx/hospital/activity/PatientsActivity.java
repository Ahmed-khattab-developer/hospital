package com.rx.hospital.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rx.hospital.R;
import com.rx.hospital.adapter.PatientsAdapter;
import com.rx.hospital.model.Patient;

import java.util.ArrayList;

public class PatientsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients);


        RecyclerView courseRV = findViewById(R.id.recyclerView);

        Patient Patient1 = new Patient();
        Patient1.setName("ahmed");
        Patient1.setGender("male");
        Patient Patient2 = new Patient();
        Patient2.setName("mohammed");
        Patient2.setGender("male");
        Patient Patient3 = new Patient();
        Patient3.setName("ebrahim");
        Patient3.setGender("male");
        Patient Patient4 = new Patient();
        Patient4.setName("mostofa");
        Patient4.setGender("male");
        Patient Patient5 = new Patient();
        Patient5.setName("koloud");
        Patient5.setGender("female");
        Patient Patient6 = new Patient();
        Patient6.setName("omar");
        Patient6.setGender("male");
        Patient Patient7 = new Patient();
        Patient7.setName("reda");
        Patient7.setGender("male");
        Patient Patient8 = new Patient();
        Patient8.setName("doaa");
        Patient8.setGender("female");
        Patient Patient9 = new Patient();
        Patient9.setName("safaa");
        Patient9.setGender("female");
        Patient Patient10 = new Patient();
        Patient10.setName("asmaa");
        Patient10.setGender("female");
        Patient Patient11 = new Patient();
        Patient11.setName("dalia");
        Patient11.setGender("female");

        ArrayList<Patient> myListData = new ArrayList<>();
        myListData.add(Patient1);
        myListData.add(Patient2);
        myListData.add(Patient3);
        myListData.add(Patient4);
        myListData.add(Patient5);
        myListData.add(Patient6);
        myListData.add(Patient7);
        myListData.add(Patient8);
        myListData.add(Patient9);
        myListData.add(Patient10);
        myListData.add(Patient11);

        PatientsAdapter courseAdapter = new PatientsAdapter(this, myListData);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
        
    }
}