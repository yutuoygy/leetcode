package jinyou;

import java.util.HashMap;

public class RomanToInteger {
    /*
    Given a roman numeral, convert it to an integer.
    Input is guaranteed to be within the range from 1 to 3999.

     */

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length(), result = map.get(s.charAt(len - 1));
        /*
        as the last digit can be a integer determined by the last digit of roman for example
        the Roma digit MDLV, the last digit can always be 5.
         */
        for (int i = len - 2; i >= 0; i--) {
            /*
            then we start from the digit before the last digit as s.length() - 2, and iterate from the
            small digit to larger digit, which means from right to left.
             */
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
                /*
                we do the calculation if s.CharAt(i) < s.CharAt(i+1) we should
                deduct it, as IV - 4 = 5 -1.
                or when s.CharAt(i) > s.CharAt(i+1) we should add it, as VI - 6
                 = 5 + 1;
                 */
            }

        }
        return result;
    }
}
