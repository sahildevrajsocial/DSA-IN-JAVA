package com.devraj.array;

import java.util.*;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};
        Set<Integer> union = unionSortedArray(arr1, arr2);
        for (int it : union) {
            System.out.print(it + " ");
        }
    }

    static Set<Integer> unionSortedArray(int[] arr1, int[] arr2) {

        Set<Integer> st = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);
        }
        return st;
    }
}
