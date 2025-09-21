package com.devraj.strings;

import java.util.Scanner;

class CheckThePalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        CheckThePalindrome palindrome = new CheckThePalindrome();
        System.out.println(palindrome.isPalindrome(s));
    }
}
