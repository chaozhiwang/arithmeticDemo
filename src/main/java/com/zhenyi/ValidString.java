package com.zhenyi;

import java.util.Stack;
/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class ValidString {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();
        return  false;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack);
        stack.push("1");
        System.out.println(stack);
        stack.push("22");
        stack.push("hello");
        System.out.println(stack);
       // stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
