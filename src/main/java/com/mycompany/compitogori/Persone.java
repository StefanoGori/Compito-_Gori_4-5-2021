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
public class Persone extends Thread{
    String sesso;
    
    
    public Persone(String sesso){
        this.sesso=sesso;
    }
    
    
    @Override
    public void run(){
        if(sesso.equals("donna")){
            main.pieno.tryLogin();
            Bagno.occupa(sesso);
            main.pieno.logout();
        }
        if(sesso.equals("uomo")){
            main.vuoto.tryLogin();
            Bagno.occupa(sesso);
            main.vuoto.logout();
            
        }
    }
}
