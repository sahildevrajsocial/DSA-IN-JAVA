package com.devraj.array;

public class MaximumNumberOfEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {3,8,2,4,5,6,7};
        int target = 3;
        int maxEven = 0;
        for(int i = 0; i<target; i++) {
            if(arr[i] % 2 == 0) {
                maxEven++;
            }
        }
        System.out.println(maxEven);
        int left = 1;
        int right = target+1;
        int even = 0;
        for(int i = left; i < right; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            }
            if(right<arr.length){
                right++;
            }
            else {
                break;
            }
            maxEven = Math.max(maxEven, even);
        }

        System.out.println(maxEven);
    }
}
