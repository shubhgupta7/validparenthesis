package com.Project.ValidParenthesis.services;

import com.Project.ValidParenthesis.model.stackInfo;
import com.Project.ValidParenthesis.repository.resultsRepo;
import com.Project.ValidParenthesis.repository.stackInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Stack;

@Service
public class stackService {


    static public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(s.length()==0 || s==null){
            return false;
        }
        char[] arr = s.toCharArray();
        int i=0;
        do{
            if(arr[i]==']' && st.peek()=='['){
                st.pop();
            }
                else if(arr[i]==')' && st.peek()=='('){
                st.pop();
            }
                    else if(arr[i]=='}' && st.peek()=='{'){
                st.pop();
            }
                    else if(arr[i]=='>' && st.peek()=='<'){
                        st.pop();
            }
                    else if(arr[i]=='[' ||arr[i]=='{'|| arr[i]=='<' || arr[i]=='('){
                        st.push(arr[i]);
            }
                    i++;
        }
        while(i<n);
        if(st.isEmpty())return true;
        else{
            return false;
        }
    }
}
