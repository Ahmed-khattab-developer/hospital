package com.rx.hospital.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rx.hospital.R;
import com.rx.hospital.adapter.DoctorAdapter;
import com.rx.hospital.model.Doctor;

import java.util.ArrayList;

public class DoctorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);


        RecyclerView courseRV = findViewById(R.id.recyclerView);

        Doctor doctor1 = new Doctor();
        doctor1.setName("ahmed");
        doctor1.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor2 = new Doctor();
        doctor2.setName("mohammed");
        doctor2.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor3 = new Doctor();
        doctor3.setName("ebrahim");
        doctor3.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor4 = new Doctor();
        doctor4.setName("mostofa");
        doctor4.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor5 = new Doctor();
        doctor5.setName("koloud");
        doctor5.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor6 = new Doctor();
        doctor6.setName("omar");
        doctor6.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor7 = new Doctor();
        doctor7.setName("reda");
        doctor7.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor8 = new Doctor();
        doctor8.setName("doaa");
        doctor8.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor9 = new Doctor();
        doctor9.setName("safaa");
        doctor9.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor10 = new Doctor();
        doctor10.setName("asmaa");
        doctor10.setSpeciality("HOSPITAL MEDICINE");
        Doctor doctor11 = new Doctor();
        doctor11.setName("dalia");
        doctor11.setSpeciality("HOSPITAL MEDICINE");

        ArrayList<Doctor> myListData = new ArrayList<>();
        myListData.add(doctor1);
        myListData.add(doctor2);
        myListData.add(doctor3);
        myListData.add(doctor4);
        myListData.add(doctor5);
        myListData.add(doctor6);
        myListData.add(doctor7);
        myListData.add(doctor8);
        myListData.add(doctor9);
        myListData.add(doctor10);
        myListData.add(doctor11);

        DoctorAdapter courseAdapter = new DoctorAdapter(this, myListData);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);

    }
}