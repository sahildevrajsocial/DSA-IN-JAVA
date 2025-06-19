package com.devraj.array;

import java.util.Arrays;

public class SecondLargestElementBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 7, 5,6};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
    static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        int secondL = arr[0];

        for(int i=arr.length-2; i>=0; i--){
            int largest = arr[arr.length-1];
            if(arr[i] != largest) {
                secondL = arr[i];
                return secondL;
            }
        }
        return -1;
    }
}

