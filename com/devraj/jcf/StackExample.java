package com.devraj.jcf;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}

//uses stack data structure, elements are push inside