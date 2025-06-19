package com.devraj.array;

public class RotateArrayByDPlacesBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 3;
    }
    static void rotate(int[] arr, int target){
        int temp = arr[target%arr.length];
        for(int i = target; i<arr.length; i++){
            arr[i-target] = arr[i];
        }

    }
}
