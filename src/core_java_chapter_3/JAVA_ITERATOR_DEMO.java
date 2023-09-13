/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_3;

    import java.io.*;  
    import java.util.*;  
        
    public class JAVA_ITERATOR_DEMO {  
        public static void main(String[] args)  
        {  
            ArrayList<String> cityNames = new ArrayList<String>();  
        
            cityNames.add("Delhi");  
            cityNames.add("Mumbai");  
            cityNames.add("Kolkata");  
            cityNames.add("Chandigarh");  
            cityNames.add("Noida");  
        
            // Iterator to iterate the cityNames  
            Iterator iterator = cityNames.iterator();  
        
            System.out.println("CityNames elements : ");  
        
            while (iterator.hasNext())  
                System.out.print(iterator.next() + " ");  
        
            System.out.println();  
        }  
    }  