/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB05;
import java.util.Stack;

/**
 *
 * @author Muzamuil Ahmed
 */

class Solution {
    public boolean isValid(String s) {
         Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }else if(s.charAt(i)=='{'){
                st.push('}');
            }else if(s.charAt(i)=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=s.charAt(i)){
                return false;
    }
}
       return st.isEmpty();
    }
}
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Code is working");   
    }
    
}
