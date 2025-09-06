package com.devraj.jcf;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.addFirst(100);
        ll.addLast(100);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.size());
    }
}

//can store elements from both front and back.