package com.devraj.javaoops;

class Test2 {
    int age;
    public void assignAge(int num) {
        age  = num;
    }
}
public class ObjCreation2 {
    public static void main(String[] args) {
        Test2 test1 = new Test2();
        test1.assignAge(10);

        Test2 test2 = new Test2();
        test2.assignAge(20);

        System.out.println(test2.age);
    }
}

// can create multiple objects
