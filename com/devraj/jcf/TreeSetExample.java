package com.devraj.jcf;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(4);
        ts.add(1);
        ts.add(4);
        ts.add(-2);
        System.out.println(ts);
        System.out.println(ts.floor(5)); //<=5
        System.out.println(ts.ceiling(3)); //<=3
        for(var num: ts) {
            System.out.println(num);
        }
    }
}

// data structure that store unique elements in a sorted order
