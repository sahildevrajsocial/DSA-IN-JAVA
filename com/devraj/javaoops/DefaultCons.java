package com.devraj.javaoops;

class Test4 {
    public Test4() {
        System.out.println("test constructor called");
    }
    public void printHello() {
        System.out.println("Hello");
    }
}

public class DefaultCons {
    public static void main(String[] args) {
        Test4 test = new Test4();
        test.printHello();
    }
}

/* A constructor is called automatically when object of a class is created
* 1. A constructor should have same name of the class it belongs to
* 2. Constructors should not have any type of return type, not even void
* 3. It is called automatically when an object is created so no need to call the object in order to call a constructor
*
* This is a default constructor, a default constructor does not have any parameters, if no constructor is defined in a
* class then java automatically provides a default constructor that initializes object fields to their default values */