package com.devraj.array;

public class CountSubarraysWithSumGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,7,1,2};
        int target = 4;
        int x = 10;
        int sum = 0;
        int counter = 0;
        for(int i = 0; i<target; i++) {
            sum += arr[i];
        }
        if(sum>=x) {
            counter++;
        }

        int left = 0;
        int right = target - 1;

        while(right < arr.length-1) {
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            if(sum>=x) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
