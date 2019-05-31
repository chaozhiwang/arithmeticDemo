package com.zhenyi;

import java.util.HashMap;
import java.util.Map;
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
        Stack<Character> stack = new Stack<Character>();
        Map<String,String> map = new HashMap<String,String>();
        map.put("{}","{}");
        map.put("[]","[]");
        map.put("()","()");
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(ch[i]);
                continue;
            }
            String temp = stack.peek().toString()+ch[i]+"";
            if(map.containsKey(temp)) {
                stack.pop();
            }else{
                stack.push(ch[i]);
            }
        }
        return  stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidString valid = new ValidString();
        String str = "{{{}}}";
        long start = System.currentTimeMillis();

        System.out.println(valid.isValid(str));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
