package com.devraj.javaoops;

class Test3 {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

public class ParameterisedMethods {
    public static void main(String[] args) {
        Test3 test = new Test3();
        System.out.println(test.sum(10, 20));
    }
}

// parameterised public method returning an integer
// public method can be accessed from anywhere