package com.devraj.array;

import java.util.*;

public class NumberOfPairs {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target:- ");
        int target = sc.nextInt();
        System.out.println(pointer(arr, target));
    }
    static int pointer(int arr[], int target) {
        Arrays.sort(arr);
        int counter = 0;
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
