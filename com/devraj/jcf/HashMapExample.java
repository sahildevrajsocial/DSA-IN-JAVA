package com.devraj.jcf;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Sahil");
        mp.put(2, "Sangram");
        mp.put(3, "Partyaksh");
        mp.put(4, "Gunjan");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.size());
        System.out.println(mp.remove(4));
        System.out.println(mp);
        System.out.println(mp.size());
    }
}

// in HashMap you need a key and a value
// for example a roll no in the class is key, and name is the value that is assigned to that key
// but we can always manipulate it depending upon the problem statement
// hashmap doesn't store the keys in a sorted order
