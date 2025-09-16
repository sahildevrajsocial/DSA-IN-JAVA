package com.devraj.basichashing;

import java.util.*;

public class NumberHashing1 {
    public static void main(String[] args) {
        // Take size of an array
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Take input of the array
        System.out.println("Take array inputs:- ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // See output of the array
        System.out.println("Output:- ");
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Sorting the array to get the maxElement
        Arrays.sort(arr);
        int maxElement = arr[n-1];

        // Making a new hash array and using maxElement+1 as its size
        int hash[] = new int[maxElement + 1];
        for(int i = 0; i<n; i++){
            hash[arr[i]]++;
        }

        // Taking number of queries and running a while loop till q-->0 where we take number to check frequency, under
        // which we make an if else condition where if num is greater than 0 and less than the size of hash, it will
        // print frequency of that num
        System.out.println("Enter number of queries:- ");
        int q = sc.nextInt();
        while(q-->0) {
            System.out.println("Enter number to check frequency:- ");
            int num = sc.nextInt();

            if(num>0 && num < hash.length) {
                System.out.println("Frequency of "+num+"="+hash[num]);
            }
            else{
                System.out.println(num + "is out of range");
            }
        }
    }
}
