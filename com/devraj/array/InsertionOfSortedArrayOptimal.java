package com.devraj.array;

import java.util.*;

public class InsertionOfSortedArrayOptimal {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
        List<Integer> findIntersection = findIntersection(arr1, arr2);
        System.out.print(findIntersection);
    }

    static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        Vector<Integer> ans = new Vector<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                if (ans.isEmpty() || ans.lastElement() != arr1[i]) {
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
