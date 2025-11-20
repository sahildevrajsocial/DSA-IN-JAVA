package com.devraj.array;

import java.util.*;

public class ConstantWindow {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int target = 4;
        int sum = 0;

        for(int i = 0; i < target; i++) {
            sum += arr[i];
        }
        int left = 0, right = target-1, maxSum = sum;
        while(right < arr.length-1) {
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum+arr[right];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
