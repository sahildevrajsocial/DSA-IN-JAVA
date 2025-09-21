package com.devraj.strings;
import java.util.*;

class CheckLargestOdd {
    public String largestOdd(String s) {
        int j = -1, n = s.length();
        for(int i = n - 1; i >= 0; i--) {
            if((s.charAt(i) - '0') % 2 == 1) {
                j = i;
                break;
            }
        }

        if(j == -1) {
            return "";
        }

        int i = 0;
        while(i < n && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i, j+1);
    }
}

public class LargestOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:- ");
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        CheckLargestOdd oddNumber = new CheckLargestOdd();
        System.out.println(oddNumber.largestOdd(s));
    }
}
