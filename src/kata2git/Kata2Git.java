/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata2git;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author daniel
 */
public class Kata2Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] data = {1,2,3,4,1,2,3,4,1,2,3,4,5,5,1};

        // version 4
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for(Map.Entry<Integer, Integer> entry : histogr.entrySet()){
            System.out.println(entry.getKey() + "====>" + entry.getValue());
        }
    }
    
}
