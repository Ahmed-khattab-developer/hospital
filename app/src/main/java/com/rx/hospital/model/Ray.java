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
public class Ray {
   
    private String rays;

    public Ray(String rays) {
        this.rays = rays;
    }

    public String getRays() {
        return rays;
    }

    public void setRays(String rays) {
        this.rays = rays;
    }
    
    public void addRay(Ray ray){
        System.out.println("ray");
    }
}
