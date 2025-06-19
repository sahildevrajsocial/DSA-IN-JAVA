package com.devraj.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {12, 15, 22, 25, 29, 31, 34, 39, 42, 49, 60};
        int target = 49;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
