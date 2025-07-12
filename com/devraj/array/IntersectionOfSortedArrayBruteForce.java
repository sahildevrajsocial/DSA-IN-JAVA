package com.devraj.array;

import java.util.*;

public class IntersectionOfSortedArrayBruteForce {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 6, 7};
        List<Integer> intersection = findIntersection(arr1, arr2);
        for(int num : intersection) {
            System.out.print(num+" ");
        }
    }

    static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for(int num:arr1) {
            set1.add(num);
        }

        Set<Integer> result = new LinkedHashSet<>();
        for(int num:arr2) {
            if(set1.contains(num)) {
                result.add(num);
            }
        }

        return new ArrayList(result);
    }

}
