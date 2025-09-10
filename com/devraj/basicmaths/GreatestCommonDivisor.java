package com.devraj.basicmaths;

class Gcd{
    public int gcd(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}


public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Gcd gcd = new Gcd();
        System.out.println(gcd.gcd(20,40));
    }
}

// using euclidean algo