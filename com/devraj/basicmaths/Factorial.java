package com.devraj.basicmaths;

class Fact {
    public int factorial(int n) {
        // Base case: if n is equal to 0, then 0! is defined as 1
        if (n == 0) {
            return 1;
        }
        int ans = 1;
        for(int i = 1; i<=n; i++) {
            ans *= i;
        }
        return ans;
    }
}


public class Factorial {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.factorial(6));
    }
}
