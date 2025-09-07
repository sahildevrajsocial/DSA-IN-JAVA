package com.devraj.jcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomComparatorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        //sort it in the descending order
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                if(num1 < num2) {
                    return 1;
                }
                else if(num1 > num2) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
        System.out.println(al);
    }
}
