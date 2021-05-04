/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compitogori;

/**
 *
 * @author informatica
 */
public class main {

    /**
     * @param args the command line arguments
     */
        static LoginQueueUsingSemaphore pieno=new LoginQueueUsingSemaphore(1);
        static LoginQueueUsingSemaphore vuoto=new LoginQueueUsingSemaphore(1);
        Bagno bu1=new Bagno();
        Bagno bd1=new Bagno();
    public static void main(String[] args) {
        // TODO0 code application logic here
        
        Persone p1=new Persone("uomo");
        Persone p2=new Persone("uomo");
        Persone p3=new Persone("donna");
        Persone p4=new Persone("donna");
        
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        
        
        
        
    }
    
}
