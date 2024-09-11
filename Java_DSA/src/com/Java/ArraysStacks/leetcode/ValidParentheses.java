package com.Java.ArraysStacks.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String str = "(])";
		System.out.println(IsValid(str));
	}

	public static boolean IsValid(String str) {
		Stack<Character> CharArr = new Stack<>();
		if (str.toCharArray().length < 2)
			return false;
		// Adding all the characters into Stack
		for (Character c : str.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				CharArr.push(c);
			} else if ((c == ')' || c == ']' || c == '}')) {
				if (CharArr.empty())
					return false;
				switch (c) {
				case ')':
					if (CharArr.getLast() == '(') {
						CharArr.pop();
					}
					break;
				case ']':
					if (CharArr.getLast() == '[') {
						CharArr.pop();
					}
					break;
				case '}':
					if (CharArr.getLast() == '{') {
						CharArr.pop();
					}
					break;
				default:
					break;
				}
			} else
				return false;

		}
//		System.out.println((CharArr.empty()) ? true : false);
		return (CharArr.empty()) ? true : false;
	}
}
