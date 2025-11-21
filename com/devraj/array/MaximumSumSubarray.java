package com.devraj.array;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {4,2,-3,7,8,1,0};
        int target = 3;
        int left = 0;
        int right = target-1;
        int sum = 0;
        int maxSum = sum;

        for(int i = 0; i<target; i++) {
            sum += arr[i];
        }

        while(right < arr.length-1) {
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println(maxSum);
    }
}
