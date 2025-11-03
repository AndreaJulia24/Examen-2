/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Andi
 */


public class JsonReader {
  private static final String JSON_FILE_PATH = "data.json";
    private static final ObjectMapper MAPPER = new ObjectMapper ();

    public static Map readFromJsonFile() { // Visszatérési típus Map
        // FIX: Nincs diamond operator a Java 6 stílus miatt, de pontosítjuk a típust
        TypeReference<Map<String, Object>> mapType = new TypeReference<Map<String, Object>>() {};
        
        FileReader reader = null;
        try {
            reader = new FileReader(JSON_FILE_PATH);
    
            Map rootData = MAPPER.readValue(reader, mapType); 
            System.out.println("Sikeres fajlbeolvasas: ");
            
            return rootData; 
            
        } catch (IOException e) {
            System.err.println("HIBA: Nem találhato a fajl (" + JSON_FILE_PATH);
            e.printStackTrace();
            return null;
       
        } 
    }
}