package com.devraj.array;

import java.util.*;

public class RemoveDuplicatesBruteForce {
    public static void main(String[] args) {
        int[] arr= {1,1,2,2,2,3,3};
        int newLength = sort(arr);
        System.out.println("Removed duplicates from sorted array :-");
        for(int i = 0; i<newLength; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    static int sort(int[] arr) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i<arr.length; i++) {
            st.add(arr[i]);
        }
        int index = 0;
        for(int it:st){
            arr[index] = it;
            index++;
        }
        return index;
    }
}
