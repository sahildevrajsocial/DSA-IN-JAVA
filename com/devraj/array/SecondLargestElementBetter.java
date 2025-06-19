package com.devraj.array;

public class SecondLargestElementBetter {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,6,7,5};
        int ans = secondLargest(arr);
        System.out.println(ans);

    }

    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
                return secondLargest;
            }
        }
        return -1;
    }
}
