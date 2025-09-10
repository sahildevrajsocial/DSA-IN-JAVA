package com.devraj.array;

class Check {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class CheckIfSorted {
    public static void main(String[] args) {
        Check sortedOrNot = new Check();
        System.out.println(sortedOrNot.arraySortedOrNot(new int[]{1,2,4,3},4));
    }
}
