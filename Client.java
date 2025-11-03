/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author Andi
 */
public class Client extends BaseEntity {
    private String name;
    private String phone;
    private String email;

    public Client(String id, String name, String phone, String email) {
        super(id);
        this.name = name;
        this.phone = phone;
        this.email = email;
        BaseEntity.entityCounter++; // Using the static counter
    }

    public String getName() { return name; }

    @Override
    public String businessKey() {
        // A unique client is often identified by their ID or a combination of name/email
        return this.id != null ? this.id : this.name + this.email;
    }

    @Override
    public String toString() {
        return "Client [ID=" + id + ", Name=" + name + ", Email=" + email + "]";
    }

   
    
}
