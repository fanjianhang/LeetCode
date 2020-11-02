package hot100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 
 *  
 * 
 * 示例：
 * 
 * 输入：n = 3 输出：[ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Problem22 {

}

class Solution22 {
  public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<String>();
    for (int i = 0; i < n; i++) {
      
    }
    return null;
  }

  public boolean checkValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      stack.add(s.charAt(i));
      if (stack.peek() == '(' && s.charAt(i + 1) == ')') {
        stack.pop();
      }
    }
    return stack.isEmpty();
  }
}