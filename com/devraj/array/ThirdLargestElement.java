package com.devraj.array;

import java.util.*;

class ThirdLarge {
    public int ThirdLarge(int arr[], int n) {
        n = arr.length;
        Arrays.sort(arr);
        return arr[n - 3];
    }
}

public class ThirdLargestElement {
    public static void main(String[] args) {
        ThirdLarge thirdLarge = new ThirdLarge();
        System.out.println(thirdLarge.ThirdLarge(new int[]{1,2,3,4,5}, 5));
    }
}
