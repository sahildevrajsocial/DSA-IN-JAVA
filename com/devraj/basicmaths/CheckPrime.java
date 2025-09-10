package com.devraj.basicmaths;

class CheckP {
    public boolean isPrime(int n) {
        // Base case: if n is one, then return true
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= n-1; i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class CheckPrime {
    public static void main(String[] args) {
        CheckP cp = new CheckP();
        System.out.println(cp.isPrime(6));
    }
}

// we can optimize it by iterating the loop till sqrt of n using Math.sqrt(n).