/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Andi
 */
public class Metadata {
    private String priority;
    private boolean courtesyCar;

    public Metadata(String priority, boolean courtesyCar) {
        this.priority = priority;
        this.courtesyCar = courtesyCar;
    }

    public String getPriority(){
        return priority;
    }
    public boolean hasCourtesyCar(){
        return courtesyCar;
    }

    @Override
    public String toString() {
        return "Meta [Priority: " + priority + ", Courtesy Car: " + courtesyCar + "]";
    }
}
