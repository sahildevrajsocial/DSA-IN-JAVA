package com.devraj.array;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3};
        Scanner sc = new Scanner(System.in);
        int result[] = new int[arr.length];
        int index = 0;

        result[index] = arr[0];
        index++;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] !=  arr[i-1]) {
                result[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i<arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
