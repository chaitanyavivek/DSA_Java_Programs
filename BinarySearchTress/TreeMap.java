// Java program to demonstrate 
// the working of TreeMap 

import java.util.*; 
class TreeMap { 
    public static void main(String args[]) 
    { 
        // Initialization of a TreeMap 
        // using Generics 
        TreeMap<Integer, String> t 
            = new TreeMap<Integer, String>(); 

        // Inserting the Elements 
        t.put(10, "vivek"); 
        t.put(11, "chai"); 
        t.put(12, "chinta"); 
        
        // Prints the TreeMap
        System.out.println(t);
        
        // Check for the key in the map
        System.out.println(t.containsKey(10));
        
        // Iterating over TreeMap
        for(Map.Entry<Integer, String>e : t.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    } 
} 
