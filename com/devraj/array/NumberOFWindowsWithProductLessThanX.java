package com.devraj.array;

public class NumberOFWindowsWithProductLessThanX {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,2};
        int target = 3;
        int x = 10;
        int product = 1;
        int counter = 0;
        for(int i = 0; i < target; i++) {
            product *= arr[i];
        }
        if(product < x) {
            counter++;
        }

        int left = 0;
        int right = target - 1;

        while(right < arr.length-1) {
            product = product / arr[left];
            left++;
            right++;
            product = product * arr[right];
            if(product <= x){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
