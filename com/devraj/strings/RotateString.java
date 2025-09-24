package com.devraj.strings;

import java.util.*;

class CheckRotation {
    public boolean rotationCheck(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0 , i);
            if(rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}

public class RotateString {
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
