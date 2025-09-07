package com.devraj.jcf;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(12, "Sahil");
        mp.put(1, "Sangram");
        mp.put(8, "Partyaksh");
        mp.put(16, "Gunjan");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.size());
        System.out.println(mp.remove(4));
        System.out.println(mp);
        System.out.println(mp.size());
        System.out.println(mp);
        System.out.println(mp.ceilingKey(2));
        System.out.println(mp.floorKey(7));
    }
}

// in TreeMap you need a key and a value
// for example a roll no in the class is key, and name is the value that is assigned to that key
// but we can always manipulate it depending upon the problem statement
// the only difference between tree map and hash map is that it stores the values in a sorted order of keys
// treemap doesn't store any duplicate