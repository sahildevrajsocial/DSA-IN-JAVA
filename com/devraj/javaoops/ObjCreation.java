package com.devraj.javaoops;

class Test1 {
    public void printTest() {
        System.out.println("Hello without static");
    }
}

public class ObjCreation {

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.printTest();
    }

}

// for non static method, you need to make an object