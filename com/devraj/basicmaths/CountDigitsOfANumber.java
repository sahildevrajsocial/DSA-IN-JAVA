package com.devraj.basicmaths;

class Digits {
    public int countDigit(int n) {
        // Base case: if n is 0, it has 1 digit
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(n>0) {
            n /= 10;
            count += 1;
        }
        return count;
    }
}

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Digits digits = new Digits();
        System.out.println(digits.countDigit(2456));
    }
}
