package com.devraj.basicmaths;

class Solution {
    public int countOddDigit(int n) {
        // Base case: if n less than equals to 0, it returns 0 digit
        if(n <= 0) {
            return 0;
        }
        int count = 0;
        while(n > 0) {
            int lastDigit = n%10;
            if(lastDigit%2 != 0) {
                count++;
            }
            n = n/10;
        }
        return count;
    }
}

public class OddDigitCounter {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countOddDigit(23456));
    }
}
