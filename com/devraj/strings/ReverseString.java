package com.devraj.strings;

import java.util.*;

class Reverse {
    public void reverseString(List<Character> s) {
        Stack<Character> stack = new Stack<>();

        // Push characters onto the stack
        for(char c : s) {
            stack.push(c);
        }

        // Pop characters from the stack to reverse the string
        for(int i = 0; i < s.size(); i++) {
            s.set(i, stack.pop());
        }
    }
}

public class ReverseString {
    public static void main(String[] args) {
        List<Character> str = new ArrayList<>(Arrays.asList('h','e','l','l','o'));

        Reverse reverse = new Reverse();
        reverse.reverseString(str);

        for(char c : str) {
            System.out.print(c+" ");
        }
    }
}
