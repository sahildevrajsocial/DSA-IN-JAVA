package com.devraj.array;

public class SecondLargesElementOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 7, 5, 6};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }

    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}
