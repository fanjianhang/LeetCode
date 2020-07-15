import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

/**
 * 20. 有效的括号 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 * 
 * 示例 1:
 * 
 * 输入: "()" 输出: true 示例 2:
 * 
 * 输入: "()[]{}" 输出: true 示例 3:
 * 
 * 输入: "(]" 输出: false 示例 4:
 * 
 * 输入: "([)]" 输出: false 示例 5:
 * 
 * 输入: "{[]}" 输出: true
 */

public class Problem20 {

}

class Solution {
    private final HashMap<Character, Character> map;

    public Solution() {
        this.map = new HashMap<Character, Character>();
        this.map.put(']', '[');
        this.map.put('}', '{');
        this.map.put(')', '(');
    }

    public boolean isValid(final String s) {
        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            // if the char is a closing bracket
            if (this.map.containsKey(c)) {
                final char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != this.map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}