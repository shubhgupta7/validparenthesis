package com.Project.ValidParenthesis.services;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class stackService {


    static public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[' || c == '<') {
                st.push(c);
            } else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else if (c == '>' && !st.isEmpty() && st.peek() == '<') {
                st.pop();
            } else if (c != ')' && c != '}' && c != ']' && c != '>') {
                continue; // Skip non-parenthesis characters
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
}
