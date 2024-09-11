package com.Java.ArraysStacks.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String str = "(])";
		System.out.println(IsValid(str));
	}

	public static boolean IsValid(String str) {
		Stack<Character> stk = new Stack<>();
        if (str.toCharArray().length < 2)
            return false;
        // Adding all the characters into Stack
        for (Character c : str.toCharArray()) {
            switch (c) {
                case '(':
                    stk.push(')');
                    break;
                case '[':
                    stk.push(']');
                    break;
                case '{':
                    stk.push('}');
                    break;
                default:
                    if (stk.isEmpty() || stk.pop() != c)
                        return false;
                    break;
            }

        }
        return (stk.empty()) ? true : false;
    }
}
