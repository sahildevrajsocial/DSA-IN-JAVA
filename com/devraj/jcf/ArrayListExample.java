package com.devraj.jcf;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(20);
        aList.add(30);
        aList.add(40);
        aList.add(50);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(3));
        System.out.println(aList.remove(2));
        System.out.println(aList);
        aList.add(2,30);
        System.out.println(aList);
        System.out.println(aList.contains(70));
    }
}

//can make an array of any size
