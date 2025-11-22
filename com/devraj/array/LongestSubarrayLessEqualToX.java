package com.devraj.array;

public class LongestSubarrayLessEqualToX {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,4,1};
        int target = 3;
        int x = 6;
        int sum = 0;

        for(int i = 0; i<target; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        int left = 0;
        int right = target - 1;

        while(right < arr.length-1) {
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            maxSum = Math.max(maxSum, sum);
        }
        if(maxSum > x) {
            System.out.println(sum);
        }
        else {
            System.out.println(maxSum);
        }
    }
}
