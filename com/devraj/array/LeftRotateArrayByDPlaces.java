package com.devraj.array;

public class LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        leftRotate(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void leftRotate(int[] arr, int d) {
        d = d % arr.length;

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = arr.length - d, j=0; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - d)];
        }
    }
}
