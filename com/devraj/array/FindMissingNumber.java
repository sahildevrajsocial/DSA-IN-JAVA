package com.devraj.array;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissing(arr));
    }

    static int findMissing(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1; // if nothing is missing
    }
}
