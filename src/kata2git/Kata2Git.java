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
        int[] data = {1,2,3,4,1,2,3,4,1,2,3,4,5,5,1};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        // version 2
        for (int key : data){
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + "====>" + entry.getValue());
        }
    }
    
}
