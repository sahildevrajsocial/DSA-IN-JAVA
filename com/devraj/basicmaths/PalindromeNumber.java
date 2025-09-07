package com.devraj.basicmaths;

class PalinNumber {
    public boolean isPalindrome(int n) {
        // if n is a negative number then the number is not a palindrome
        if (n < 0) {
            return false;
        }
        int reverseNum = 0;
        int originalNum = n;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n /= 10;
        }
        return originalNum == reverseNum;
    }
}


public class PalindromeNumber {
    public static void main(String[] args) {
        PalinNumber number = new PalinNumber();
        System.out.println(number.isPalindrome(12121));
    }
}
