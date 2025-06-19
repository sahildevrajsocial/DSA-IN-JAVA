package com.devraj.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int start = 1, end = 4, target = 0;
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(search(arr, start, end,target));

    }

    static boolean search(int[] arr, int start, int end, int target) {
        for(int i = start; i<end; i++){
            if(arr[i]==target) {
                return true;
            }
        }
        return false;
    }
}
