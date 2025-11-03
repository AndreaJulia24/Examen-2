/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andi
 */
public abstract class WorkOrder implements Billable {
    private String type; 
    private List<Task> tasks;
    private List<Part> parts;
    
    public WorkOrder(String type, List<Task> tasks, List<Part> parts) {
        this.type = type;
        this.tasks = new ArrayList<>(tasks);
        this.parts = new ArrayList<>(parts);
    }

    public double calculateTotalWorkOrderCost() {
        double total = 0;
        for (Task task : tasks) {
            total += task.calculateCost();
        }
        for (Part part : parts) {
            total += part.calculateCost();
        }
        return total;
    }

    public List<Task> getTasks() { return tasks; }
    public List<Part> getParts() { return parts; }

    @Override
    public String toString() {
        return "WorkOrder [" + type + ", Tasks: " + tasks.size() + ", Parts: " + parts.size() + ", Total Cost: " + String.format("%.2f", calculateTotalWorkOrderCost()) + "]";
    }
    
    public class Invoice {
    private String currency;
    private boolean paid;

    public Invoice(String currency, boolean paid) {
        this.currency = currency;
        this.paid = paid;
    }

    public String getCurrency() { return currency; }
    public boolean isPaid() { return paid; }
 }
}
