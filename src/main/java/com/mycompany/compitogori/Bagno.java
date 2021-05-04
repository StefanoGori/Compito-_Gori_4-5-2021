/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compitogori;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Bagno {
    
    
    
    public static void occupa(String sesso){
        if(sesso.equals("donna")){
            System.out.println("Una donna è entrata in bagno");
        }
        if(sesso.equals("uomo")){
            System.out.println("Un uomo è entrata in bagno");
        }
        try{
            Thread.sleep(2000);
        }
        catch(Exception ex){
            Logger.getLogger(Bagno.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(sesso.equals("donna")){
            System.out.println("una donna è uscita dal bagno");
        }
        if(sesso.equals("uomo")){
            System.out.println("Un uomo è uscito in bagno");
        }
        
    }
}
