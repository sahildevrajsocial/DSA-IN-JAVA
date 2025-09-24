package com.devraj.strings;

import java.util.*;

class CheckRotationOptimise {
    public boolean rotationCheck(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String doubleS = s + s;
        return doubleS.contains(goal);
    }
}

public class RotateStringOptimise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:- ");
        String string  = sc.next();

        System.out.println("Enter goal:- ");
        String goal  = sc.next();

        CheckRotation check = new CheckRotation();
        System.out.println(check.rotationCheck(string, goal));
    }
}
