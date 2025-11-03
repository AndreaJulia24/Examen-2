/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Andi
 */
public class Part implements Indentifiable, Billable {
    
    private String sku;
    private String name;
    private int quantity;
    private double unitPrice;
    private final String currency = "EUR";

    public Part(String sku, String name, int quantity, double unitPrice) {
        this.sku = sku;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String getId() { return sku; } // Using SKU as ID

    @Override
    public double calculateCost() {
        return quantity * unitPrice;
    }

    @Override
    public String getCurrency() { return currency; }

    @Override
    public String toString() {
        return "Part [SKU=" + sku + ", Name=" + name + ", Qty=" + quantity + ", Cost=" + String.format("%.2f", calculateCost()) + " " + currency + "]";
    }
    
}
