/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Andi
 */
public class Task implements Indentifiable, Billable {
    private String id;
    private String description;
    private double laborHours;
    private double hourlyRate;
    private final String currency = "EUR"; // Assuming a fixed currency for billable items

    public Task(String id, String description, double laborHours, double hourlyRate) {
        this.id = id;
        this.description = description;
        this.laborHours = laborHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double calculateCost() {
        return laborHours * hourlyRate;
    }

    // Method Overloading
    public double calculateCost(double discountPercentage) {
        double cost = calculateCost();
        return cost * (1.0 - discountPercentage / 100.0);
    }

    @Override
    public String getCurrency() {
        return currency;
    }
    public double getLaborHours(){
        return laborHours;
    }

    @Override
    public String toString() {
        return "Task [ID=" + id + ", Desc=" + description + ", Cost=" + String.format("%.2f", calculateCost()) + " " + currency + "]";
    }
}
