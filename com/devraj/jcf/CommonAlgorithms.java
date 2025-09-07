package com.devraj.jcf;

import java.util.*;

public class CommonAlgorithms {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));
        Collections.reverse(al);
        System.out.println(al);
        System.out.println(Collections.frequency(al,5));
        double num = Math.pow(2,5);
        System.out.println(num);
    }
}
