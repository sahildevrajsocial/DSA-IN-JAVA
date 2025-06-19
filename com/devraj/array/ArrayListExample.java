package com.devraj.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);

        System.out.println(list);

        for(int i = 0; i <5; i++) {
            System.out.println("Enter number:- ");
            list.add(sc.nextInt());
        }

        for(int i = 0; i <5; i++) {
            System.out.println("Number at "+i+" index:- ");
            System.out.println(list.get(i));
        }
    }



}
