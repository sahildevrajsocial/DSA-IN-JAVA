package com.devraj.jcf;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(2);
        ad.offer(6);
        ad.offer(9);
        ad.offer(10);
        System.out.println(ad);
        System.out.println(ad.peek());
        ad.poll();
        System.out.println(ad);
        ad.offerFirst(1);
        System.out.println(ad);
        ad.offerLast(11);
        System.out.println(ad);
    }
}
