/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Andi
 */
public abstract class Car extends BaseEntity {
    private String vin;
    private String make;
    private String model;
    private int year;
    private int odometerKm;
    private boolean warrantyActive;

    public Car(String vin, String make, String model, int year, int odometerKm, boolean warrantyActive) {
        // Use VIN as the BaseEntity ID
        super(vin);
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometerKm = odometerKm;
        this.warrantyActive = warrantyActive;
    }

    @Override
    public String getId(){
        return this.vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isWarrantyActive() {
        return warrantyActive;
    }
    
    @Override
    public String toString() {
        return "Car [VIN=" + vin + ", Make=" + make + ", Model=" + model + ", Year=" + year + "]";
    }
     
}
