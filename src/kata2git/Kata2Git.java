/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata2git;

import java.util.HashMap;
import java.util.Map;

public class Kata2Git {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};

        // version 5
        
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        
        for(Map.Entry<String, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + "====>" + entry.getValue());
        }
    }
}
