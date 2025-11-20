package com.devraj.array;

import java.util.*;

public class TwoPointerBasics {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target:- ");
        int target = sc.nextInt();
        System.out.println(pointer(arr, target));
    }
    static boolean pointer(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                return true;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}
