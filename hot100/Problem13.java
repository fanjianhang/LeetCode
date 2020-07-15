import java.util.HashMap;
import java.util.Map;

public class Problem13 {

}

class Solution13 {

    Map<String, Integer> map;

    public Solution13() {
        this.map = new HashMap<String, Integer>();
        this.map.put("I", 1);
        this.map.put("IV", 4);
        this.map.put("V", 5);
        this.map.put("IX", 9);
        this.map.put("X", 10);
        this.map.put("XL", 40);
        this.map.put("L", 50);
        this.map.put("XC", 90);
        this.map.put("C", 100);
        this.map.put("CD", 400);
        this.map.put("D", 500);
        this.map.put("CM", 900);
        this.map.put("M", 1000);

    }

    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length();) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                sum += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                sum += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return sum;
    }
}