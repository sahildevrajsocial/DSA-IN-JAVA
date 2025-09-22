package com.devraj.strings;

import java.util.Arrays;

class LongestPrefix {
    public String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];

        for(int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestPrefix solution = new LongestPrefix();
        String[] str = {"flower", "flow", "flight", "fly"};
        System.out.println(solution.longestCommonPrefix(str));
    }
}
