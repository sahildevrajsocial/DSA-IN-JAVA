package com.devraj.array;

public class RemoveDuplicatesOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int newLength = sort(arr);
        System.out.println("Removed duplicates from sorted array :-");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int sort(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] != arr[i]) {
                arr[index + 1] = arr[i];
                index++;
            }
        }
        return index + 1;
    }
}

