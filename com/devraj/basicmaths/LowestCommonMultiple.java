package com.devraj.basicmaths;

class LCM {
    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int LCM(int n1, int n2) {
        return (n1 * n2) / GCD(n1, n2);
    }
}


public class LowestCommonMultiple {
    public static void main(String[] args) {
        LCM lcm = new LCM();
        System.out.println(lcm.LCM(4,12));
    }
}
