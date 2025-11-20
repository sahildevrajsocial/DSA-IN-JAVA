package com.devraj.array;

import java.util.*;

public class CheckDifferencePair {
    public static void main(String[] args) {
        int arr[] = {1, 8, 12, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target:- ");
        int target = sc.nextInt();
        System.out.println(pointer(arr, target));
    }
    static boolean pointer(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
