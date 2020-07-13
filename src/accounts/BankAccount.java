/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class BankAccount { // Object

    private int number; // βλεπω περιεχομενο ενος field == getter
    private double amount; // αλλάζω περιεχόμενο ...    == setter
    private String name;
    private boolean active;
    private List<String> transactions;

    public BankAccount() {
        this.active = true;
        transactions = new ArrayList<String>();
        setTransaction(0, 'C');
    }

    public BankAccount(String name, int number) {
        this();
        this.name = name;
        this.number = number;
        setTransaction(0, 'C');
    }

    public BankAccount(String name, int number, double amount, boolean active) {
        this(name, number);
        this.amount = amount;
        this.active = active;
        setTransaction(amount, 'C');
    }

    public void setNumber(int number) {
        if (number == 0) {
            this.number = 100;
        } else {
            this.number = number;
        }
    }

    public int getNumber() {
        return this.number;
    }

    // public void setAmount(double amount) {
    // 	this.amount = amount;
    // } DANGEROUS - DO NOT TRY THIS AT HOME
    public void deposit(double amount) {
        this.amount += amount;
    }

    public double getAmount() {
        return (this.amount);
    }

    public double witdraw(double amount) {
        if (amount <= this.amount) {
            this.amount -= amount; // this.amount -> 1000, double amount = 1200	
            // transactions.add("withdrawal amount: " + amount);
            setTransaction(amount, 'W'); // (100, "W") withdrawal, (50, "D") deposit, (0, "C") creation
            return (amount);
        } else {
            // 1. deny the withrawal
            return (amount);

            // 2. withdraw available funds
//			double temp_amount = this.amount;
//			setTransaction(temp_amount, 'W');
//			this.amount -= this.amount;
//			return(temp_amount);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getActive() {
        return (this.active);
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public List<String> getTransactions() {
        return (this.transactions);
    }

    public void setTransaction(double amount, char type) {
        switch (type) {
            case 'C':
                transactions.add("Creation of account with amount " + amount + " at " + java.time.LocalDateTime.now());
                break;
            case 'D':
                transactions.add("Deposit of amount: " + amount + " at " + java.time.LocalDateTime.now());
                break;
            case 'W':
                transactions.add("Withdrawal of amount: " + amount + " at " + java.time.LocalDateTime.now());
                break;
        }
    }

    @Override
    // String name, int number, double amount, boolean active
    public String toString() {
        return ("BankAccount[name: " + name + ", number: " + number + ", amount: " + amount + ", active: " + active + "]");
    }

}
