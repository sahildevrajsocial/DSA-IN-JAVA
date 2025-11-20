package com.devraj.array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = new int[arr.length];
        int index = 0, last = arr.length-1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
            else {
                result[last] = arr[i];
                last--;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
