package com.devraj.array;

public class CheckIfSortedBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9 };
        System.out.println(checkSorted(arr));
    }
    static boolean checkSorted(int[] arr) {
        for(int i = 1; i< arr.length; i++) {
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
