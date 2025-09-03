package com.devraj.javaoops;

class BankAccount1 {
    private double balance;

    public BankAccount1(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printBalance() {
        System.out.println(balance);
    }
}

public class Encapsulate {
    public static void main(String[] args) {
        BankAccount1 accountPerson1 = new BankAccount1(200.0);
        accountPerson1.setBalance(900);
        accountPerson1.printBalance();

    }
}
