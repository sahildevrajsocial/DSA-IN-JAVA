package com.devraj.javaoops;

public class NonParameterisedMethods {
    private static int num() {
        return 10;
    }
    public static void main(String[] args) {
        System.out.println(num());
    }
}

// non parameterised private method returning 10
// private method can only be called in the same/current class and not in other class