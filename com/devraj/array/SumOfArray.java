package com.devraj.array;

class ArraySum {
    public int sum(int arr[], int n) {
        int sum = 0;
        // Iterate through the array to calculate the sum
        for (int i = 0; i < n ; i++) {
            sum += arr[i];
        }
        return sum;
    }
}


public class SumOfArray {
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        System.out.println(arraySum.sum(new int[]{1,2,3,4,5}, 5));
    }
}
