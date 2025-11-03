/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import com.mycompany.examen.WorkOrder.Invoice;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andi
 */
public abstract class Intake extends BaseEntity implements Indentifiable, Schedulable {
    private String intakeId;
    private LocalDateTime receivedAt;
    private Client client;
    private Car car;
    private List<ReportedIssue> issues;
    private Diagnostics diagnostics;
    private List<WorkOrder> workOrders;
    private Invoice invoice;
    private Metadata meta;
    
    public static final List<Intake> INTAKE_REGISTRY = new ArrayList<>();

    public Intake(String id, LocalDateTime receivedAt, Client client, Car car, List<ReportedIssue> issues, List<WorkOrder> workOrders, Invoice invoice) {
        super(id);
        this.receivedAt= receivedAt;
        this.client = client;
        this.car = car;
        this.issues = new ArrayList<>(issues);
        this.workOrders = new ArrayList<>(workOrders);
        this.invoice = invoice;
        BaseEntity.entityCounter++; // Increment entity counter
    }

    @Override
    public  String getId(){
        return this.getId();
    }

    
    public LocalDateTime getReceivedAt(){
       return receivedAt;
    }
    public Client getClient() { return client; }
    public Car getCar() { return car; }
    public Invoice getInvoice() { return invoice; }

 
    public double calculateTotalCost() {
        return workOrders.stream().mapToDouble(WorkOrder::calculateTotalWorkOrderCost).sum();
    }
    
}
