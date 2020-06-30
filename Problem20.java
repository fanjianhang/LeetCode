import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution20 solution = new Solution20();
        String s = scanner.nextLine();
        System.out.println("The string is : " + s);
        System.out.println("The result is : " + solution.isValid(s));
        scanner.close();

    }
}

class Solution20 {
    public boolean isValid(String s) {
        int sLen = s.length();
        // if the string is empty, return true.
        if (s.isEmpty()) {
            return true;
        }
        // If the string length is not even, return false.
        if (s.length() % 2 != 0) {
            return false;
        }
        //
        for (int i = 0; i < sLen / 2; i++) {
            if (s.charAt(i) != s.charAt(sLen - i - 1)) {
                return false;
            }
        }
        return true;
    }
}