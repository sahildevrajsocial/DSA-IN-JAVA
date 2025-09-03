package com.devraj.javaoops;

class BankAccount {
    double balance;
    public BankAccount(double _balance) {
        balance = _balance;
    }
    public void printBalance() {
        System.out.println(balance);
    }
}

public class ParameterizedCons {
    public static void main(String[] args) {
        BankAccount test = new BankAccount(200.0);
        test.printBalance();
    }
}

/* A constructor is called automatically when object of a class is created
* 1. A constructor should have same name of the class it belongs to
* 2. Constructors should not have any type of return type, not even void
* 3. It is called automatically when an object is created so no need to call the object in order to call a constructor
*
* This is a parameterised constructor which allows passing arguments to the constructor so that specific values can be
* assigned to object at the time of creation*/