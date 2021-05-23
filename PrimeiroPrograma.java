package com.mycompany.PrimeiroPrograma;

import java.util.Date;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        
        Date today = new Date();
        System.out.println("Today date is: " + today.toString());
        
        String idiom = System.getProperty("user.language"); 
        System.out.println("Your system language is: " + idiom);
        
        String country = System.getProperty("user.country");
        System.out.println("Your system location is: " + country);
        
        
    }
}
