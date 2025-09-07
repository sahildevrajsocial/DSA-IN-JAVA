package com.devraj.basicmaths;

class ReverseNum {
    public int reverseNumber(int n) {
        int revNum = 0;
        while(n > 0) {
            int lastDigit = n%10;
            revNum = revNum*10+lastDigit;
            n /= 10;
        }
        return revNum;
    }
}

public class ReverseANumber {
    public static void main(String[] args) {
        ReverseNum reverseNum = new ReverseNum();
        System.out.println(reverseNum.reverseNumber(23456));
    }
}
