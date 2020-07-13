/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounts;

import accounts.BankAccount;
import accounts.Person;

/**
 *
 * @author mac
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount myBa = new BankAccount();
        System.out.println(myBa);
        System.out.println(myBa.getTransactions());
        
        BankAccount ba = new BankAccount("SAVINGS", 1000);
        System.out.println(ba);
        System.out.println(ba.getTransactions());
        
        BankAccount ba2 = new BankAccount("EXCHANGE", 2000, 1500, false);
        System.out.println(ba2);
        System.out.println(ba2.getTransactions());
        
//        Person bary;
//        Person mary;
//        
//        bary.setAccount(ba2);
//        mary.setAccount(ba2);
        
        
        
    }
    
}
