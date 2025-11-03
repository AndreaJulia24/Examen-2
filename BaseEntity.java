/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.Objects;

/**
 *
 * @author Andi
 */
public abstract class BaseEntity implements Indentifiable {

    protected String id;

    // Static member used as a counter/registry for ServiceIntake
    protected static int entityCounter = 0;

    public BaseEntity(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    /**
     * Abstract method defining the unique business key for equals/hashCode.
     */
    public abstract String businessKey();

    // Implementation of equals(Object) and hashCode() using the business key.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        // Use the abstract businessKey() for comparison
        return businessKey().equals(that.businessKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessKey());
    }
}
