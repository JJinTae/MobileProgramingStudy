package com.example.interfaceprograms;

class BankAccount implements Measurable{
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;

    public BankAccount(double balance){
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        this.balance = 0;
        setBalance(balance);
    }

    public void setBalance(double balance){
        this.balance = this.balance + balance;
    }

    public double getMeasure(){
        return balance;
    }
}
