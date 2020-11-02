package hot100;

/**
 * 5. 最长回文子串 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad" 输出: "bab" 注意: "aba" 也是一个有效答案。 示例 2：
 * <p>
 * 输入: "cbbd" 输出: "bb"
 */

public class Problem5 {

}

class Solution {
    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        String result = "";
        // 遍历所有回文子串
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                // 判断是否回文
                String subStr = s.substring(i, j);
                String revStr = new StringBuffer(subStr).reverse().toString();
                if (subStr.equals(revStr) && subStr.length() > result.length()) {
                    result = subStr;
                }
            }
        }
        return result;
    }

    boolean isPalindrome(String s) {

        return false;
    }

}