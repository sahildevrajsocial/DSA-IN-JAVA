package com.devraj.basicmaths;

class LargestDigit {
    public int largestDigit(int n) {
        // if the number is 0, then it will return 0
        if(n == 0) {
            return 0;
        }
        int num = 0;
        while(n>0) {
            int lastDigit = n%10;
            if(lastDigit > num) {
                num = lastDigit;
            }
            n /= 10;
        }
        return num;
    }
}

public class LargestDigitInANumber {
    public static void main(String[] args) {
        LargestDigit ld = new LargestDigit();
        System.out.println(ld.largestDigit(23445910));
    }
}
