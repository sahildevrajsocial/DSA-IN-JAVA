package com.devraj.basicmaths;

class ArmsNum {
    public boolean isArmstrong(int n) {
        int originalNumber = n;
        int numDigits = 0;
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }

        int newNumber = 0;
        temp = originalNumber;

        while (temp > 0) {
            int lastDigit = temp % 10;
            newNumber += Math.pow(lastDigit, numDigits);
            temp /= 10;
        }
        return newNumber == originalNumber;
    }
}


public class ArmstrongNumber {
    public static void main(String[] args) {

        ArmsNum an = new ArmsNum();
        System.out.println(an.isArmstrong(153));

    }
}
