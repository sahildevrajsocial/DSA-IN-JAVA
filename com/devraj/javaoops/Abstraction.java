package com.devraj.javaoops;

abstract class BankAccount2{
    double balance;
    abstract void addMoney(double amount);
    abstract void canWithdrawMoney(double amount);

    void updateBalance(double _balance){
        balance = _balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount2{
    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }
    public void canWithdrawMoney(double amount) {
        if(amount <= super.getBalance()) {
            System.out.println("User can!");
        }
        else {
            System.out.println("User can not");
        }
    }
}

class CurrentAccount extends BankAccount2{
    double minimumLimit = 1000.0;
    public void addMoney(double amount) {
        super.updateBalance(super.getBalance() + amount);
    }
    public void canWithdrawMoney(double amount) {
        if(super.getBalance()-amount >= minimumLimit) {
            System.out.println("User can!");
        }
        else {
            System.out.println("User can not");
        }
    }
}

public class Abstraction {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.addMoney(5000);
        System.out.println("Savings Balance: " + sa.getBalance());
        sa.canWithdrawMoney(2000);
        sa.canWithdrawMoney(6000);

        System.out.println("------");

        CurrentAccount ca = new CurrentAccount();
        ca.addMoney(5000);
        System.out.println("Current Balance: " + ca.getBalance());
        ca.canWithdrawMoney(3000);
        ca.canWithdrawMoney(4500);
    }
}
