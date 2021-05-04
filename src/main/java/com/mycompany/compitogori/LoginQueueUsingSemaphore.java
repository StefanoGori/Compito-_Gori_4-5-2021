/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compitogori;
import java.util.concurrent.Semaphore;
/**
 *
 * @author informatica
 */
public class LoginQueueUsingSemaphore {
    
    private Semaphore semaphore;

    public LoginQueueUsingSemaphore(int slotLimit) {
        semaphore = new Semaphore(slotLimit);
    }

    boolean tryLogin() {
        return semaphore.tryAcquire();
    }

    void logout() {
        semaphore.release();
    }

    int availableSlots() {
        return semaphore.availablePermits();
    }

}
