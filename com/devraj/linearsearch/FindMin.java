package com.devraj.linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {5,4,5,55,64,77,2,4,-7};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
