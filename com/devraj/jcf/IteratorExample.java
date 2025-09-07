package com.devraj.jcf;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
        }
    }
}
