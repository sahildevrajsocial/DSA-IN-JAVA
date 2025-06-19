package com.devraj.array;

public class MaxValueInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,11,5,6};
        System.out.println(maxInRange(arr,2,5));

    }

    static int maxInRange(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

