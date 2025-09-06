package com.devraj.jcf;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        hs.remove(2);
        System.out.println(hs);
    }
}

// data structure that stores unique elements in any random order