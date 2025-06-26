package com.devraj.array;

import java.util.*;

public class IntersectionOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
        List<Integer> intersection = findIntersection(arr1, arr2);
        for(int num : intersection) {
            System.out.print(num+" ");
        }
    }

    static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : arr1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : arr2) {
            list2.add(num);
        }
        list1.retainAll(list2);
        return list1;
    }
}
