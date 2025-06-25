package com.devraj.array;

public class MoveZerosToEndOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void moveZeros(int[] arr) {
        int j = -1;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==0) {
                j=i;
                break;
            }
        }
        for(int i = j+1; i<arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
