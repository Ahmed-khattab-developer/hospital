/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rx.hospital;

import java.util.ArrayList;

/**
 *
 * @author mahmoud
 */
public class Patient extends Person{
    private Disease disease;
    private Ray ray;
    private PatientState conditions;

    public Patient(Disease disease, Ray ray, PatientState conditions) {
        this.disease = disease;
        this.ray = ray;
        this.conditions = conditions;
    }

    public Patient() {
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public Ray getRay() {
        return ray;
    }

    public void setRay(Ray ray) {
        this.ray = ray;
    }

    public PatientState getConditions() {
        return conditions;
    }

    public void setConditions(PatientState conditions) {
        this.conditions = conditions;
    }
   
    public void reserveAppointment(){
        System.out.println("reserve appointment");
    }
     public void cancelAppointment(){
         System.out.println("cancel appointment");
    }
      public void updateInfo(){
         System.out.println("update info");
    }
    
}
