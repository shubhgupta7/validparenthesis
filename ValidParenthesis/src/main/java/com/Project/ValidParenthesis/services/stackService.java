package com.Project.ValidParenthesis.services;

import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class stackService {


    static public boolean isValid(String s){

        Stack<Character> st = new Stack<>();
        int n = s.length();
        if( s==null || s.length()==0){
            return false;
        }
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
            }
        }
        if(st.isEmpty())return true;
        else{
            return false;
        }
    }
}
