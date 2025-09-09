package com.devraj.basicmaths;

class PerfectNum {
    public boolean isPerfect(int n) {
        // Base cae: if n is <= 0, then it will return false
        if (n <= 0) {
            return false;
        }
        int sum = 0;
        int divisor = 1;
        while (divisor < n) {
            if (n % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}


public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNum pn = new PerfectNum();
        System.out.println(pn.isPerfect(6));
    }
}
