package com.devraj.array;

import java.util.*;

public class ReturnThePair {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target:- ");
        int target = sc.nextInt();
        pointer(arr, target);
    }
    static void pointer(int arr[], int target) {
        int n1 = 0, n2 = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    n1 = i;
                    n2 = j;
                    break;
                }
            }
        }
        System.out.println("[" + arr[n1] + "," + arr[n2]+"]");
    }
}
