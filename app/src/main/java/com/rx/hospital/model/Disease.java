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
public class Disease {
    private String allergies;
    private String id;

    public Disease(String allergies, String id) {
        this.allergies = allergies;
        this.id = id;
    }


    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addDisease(Disease diease){
        System.out.println("add diease");
    }
}
