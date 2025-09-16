package com.devraj.basichashing;

import java.util.*;

public class CharacterHashing {
    public static void main(String[] args) {
        // Take size of an array
        System.out.println("Enter size of a character array:- ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char arr[] = new char[size];

        // Take input of character array
        System.out.println("Give character inputs:- ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }

        // See output of character array
        System.out.println();
        for(int i = 0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sorting the array to get maxElement
        Arrays.sort(arr);
        int maxElement = arr[size-1];

        // Making a new hash array and using maxElement + 1 as its size
        int hash[] = new int[maxElement + 1];
        for(int i = 0; i<size; i++) {
            hash[arr[i]]++;
        }

        // Taking number of queries and running a while loop till q-->0 where we take number to check frequency, under
        // which we make an if else condition where if num is greater than 0 and less than the size of hash, it will
        // print frequency of that num
        System.out.println("Enter number of queries:- ");
        int q = sc.nextInt();
        while(q-->0) {
            System.out.println("Enter character to check frequency:- ");
            char charac = sc.next().charAt(0);

            if(charac>0 && charac < hash.length) {
                System.out.println("Frequency of "+charac+"="+hash[charac]);
            }
            else{
                System.out.println(charac + "is out of range");
            }
        }
    }
}
