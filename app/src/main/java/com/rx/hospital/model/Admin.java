/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rx.hospital.model;

/**
 *
 * @author mahmoud
 */
public class Admin extends Staff {

    private static volatile Admin INSTANCE = null;

    private Admin() {}

    public static Admin getInstance() {
        if(INSTANCE == null) {
            synchronized (Admin.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Admin();
                }
            }
        }
        return INSTANCE;
    }

    public void addPatient(Patient patient){
        
    }
    public void getPatient(String id){
        
    }
    public void deletePatient(){
        
    }
    public void updatePatient(Patient patient){
        
    }

    public void addDoctor(Doctor doctor){

    }
    public void getDoctor(String id){

    }

     public void addStaff(Staff staff){
        
    }
    public void getStaff(String id){
        
    }
    public void deleteStaff(){
        
    }
    public void updateStaff(Staff staff){
        
    }
    
}
