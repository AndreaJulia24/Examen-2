/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author Andi
 */
 import java.io. FileReader ; 
 import java.io. IOException ; 
 import java.util.Map; 
 import java.util.List;
import com. fasterxml .jackson.databind. ObjectMapper ;
import com. fasterxml .jackson.core.type. TypeReference ;


public class Examen_2 {
    
    @SuppressWarnings("unchecked") 
    public static void main(String[] args) {
       
        System.out.println("--- Egyszerű JSON Kiolvasás Indul (Main) ---");
       
       // Meghívjuk a JsonReader metódusát a teljes tartalom beolvasására
       Map rootData = JsonReader.readFromJsonFile();
       
       if (rootData != null) {
           System.out.println("\nData reading:");
           
           // 1. Kiszedjük az "intakes" List<Map>-et
           List intakesListRaw = (List) rootData.get("intakes");
           
           if (intakesListRaw != null && !intakesListRaw.isEmpty()) {
               // 2. Kiszámítjuk az első Intake (Map) bejegyzést
               Map firstIntake = (Map) intakesListRaw.get(0);
               
               // 3. Kiolvassuk az Intak ID-t
               String intakeId = (String) firstIntake.get("intakeId");
               System.out.println("Intake ID: " + intakeId);
               
               // 4. Kiszámítjuk a beágyazott 'client' Map-et
               Map clientRaw = (Map) firstIntake.get("client");
               String clientName = (String) clientRaw.get("name");
               System.out.println("Ügyfél neve: " + clientName);
               
               // 5. Kiszámítjuk a 'car' Map-et és a modellt
               Map carRaw = (Map) firstIntake.get("car");
               String carModel = (String) carRaw.get("model");
               System.out.println("Autó modell: " + carModel);

               //kiolvassuk a diagnostics-ot
               Map diagnosticsRaw = (Map) firstIntake.get("diagnostics");
               List testsRaw = (List) diagnosticsRaw.get("tests");
               if (testsRaw != null && !testsRaw.isEmpty()) {
                   Map firstTest = (Map) testsRaw.get(0);
                   String testName = (String) firstTest.get("name");
                  
                   Boolean testResult = (Boolean) firstTest.get("ok"); 
                   System.out.println("Első diagnosztikai teszt: " + testName + " - Eredmény: " + (testResult != null && testResult.booleanValue() ? "OK" : "NEM OK"));
               }
               
           } else {
               System.out.println("Az 'intakes' lista üres vagy nem található.");
           }
       }
        
        
    }

    
}
