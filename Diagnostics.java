/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Andi
 */
public class Diagnostics {
    private String dtc;
    private String status;

    public Diagnostics(String dtc, String status) {
        this.dtc = dtc;
        this.status = status;
    }

    public String getDtc() {
        return dtc;
    }

    public String getStatus() {
        return status;
    }
    
}
