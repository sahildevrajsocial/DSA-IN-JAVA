package com.devraj.jcf;

public class MaximumNumberOfEvenNumbers2 {
    public static void main(String[] args) {
        int[] arr = {3,8,2,4,5,6,7};
        int target = 3;

        // Count evens in the first window
        int even = 0;
        for (int i = 0; i < target; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }

        int maxEven = even;

        // Sliding window pointers
        int left = 0;
        int right = target - 1;

        // Slide the window
        while (right < arr.length - 1) {
            // Remove leftmost element if even
            if (arr[left] % 2 == 0) {
                even--;
            }
            left++;

            // Add the next incoming right element
            right++;
            if (arr[right] % 2 == 0) {
                even++;
            }

            // Track maximum even count
            maxEven = Math.max(maxEven, even);
        }

        System.out.println(maxEven);
    }
}
