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
public class ReportedIssue {
    private String severity;
    private String code;
    private List<String> symptoms;
    private int sinceKm;


    public ReportedIssue(String severity, String code, List<String> symptoms, int sinceKm) {
        this.severity = severity;
        this.code = code;
        this.symptoms = new ArrayList<>(symptoms);
        this.sinceKm = sinceKm;
    }

    public String getSeverity() { return severity; }
    

    class TestResult {
    private final String name;
    private final boolean ok;

    public TestResult(String name, boolean ok) {
        this.name = name;
        this.ok = ok;
    }
    }
}
