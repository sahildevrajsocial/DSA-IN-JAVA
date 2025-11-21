package com.devraj.array;

public class MinimumAverageSubarray {
    public static void main(String[] args) {
        int[] arr = {10,2,3,5,9,1,4};
        int target = 2;
        int sum = 0;

        for(int i = 0; i<target; i++) {
            sum += arr[i];
        }

        double minAverage = (double) sum/target;
        int left = 0;
        int right = target - 1;
        double sumAverage2;
        int i=0, j=0;

        while(right < arr.length-1) {

            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];
            sumAverage2 = (double) sum/target;

            if(sumAverage2<minAverage) {
                i=left;
                j=right;
                minAverage = sumAverage2;
            }
        }
        System.out.println(minAverage);
        System.out.println(arr[i]+","+arr[j]);
    }
}
