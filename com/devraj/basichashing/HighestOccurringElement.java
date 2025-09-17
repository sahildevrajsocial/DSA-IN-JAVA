package com.devraj.basichashing;

import java.util.*;

public class HighestOccurringElement {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements in the array:- ");

        // Take array inputs
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Show array output
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Sorting the array to get the maxElement
        Arrays.sort(arr);
        int maxElement = arr[arr.length-1];

        // Making a new visitor array and using maxElement+1 as its size
        int visitor[] = new int[maxElement+1];
        int maxCount = 0, element = -1;

        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            if(visitor[arr[i]] == 0) {
                visitor[arr[i]] = 1;

                for(int j = 0; j < arr.length; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                    }
                }
                if(count > maxCount) {
                    maxCount = count;
                    element = arr[i];
                }
                else if(count == maxCount &&  arr[i] < element) {
                    element = arr[i];
                }
            }
        }
        System.out.println(element);
    }
}
