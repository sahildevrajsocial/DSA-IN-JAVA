package com.devraj.array;

public class CountOddNumbersInEveryWIndow {
    public static void main(String[] args) {
        int[] arr = {5,7,2,8,1,3,6};
        int target = 3;
        int odd = 0;

        for(int i = 0; i < target; i++) {
            if(arr[i] % 2 != 0) {
                odd++;
            }
        }

        if(odd == target) return;

        int maxOdd = odd;
        int left = 0;
        int right = target - 1;

        while(right < arr.length-1) {
            if(arr[left] % 2 != 0) {
                odd--;
            }
            left++;
            right++;
            if(arr[right] % 2 != 0) {
                odd++;
            }
            maxOdd = Math.max(maxOdd, odd);
        }
        System.out.println(maxOdd);
    }
}
