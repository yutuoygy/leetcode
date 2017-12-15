package jinyou;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingNumber {
    /*
    Given a string, find the length of the longest substring without repeating characters.

    Examples:

    Given "abcabcbb", the answer is "abc", which the length is 3.

    Given "bbbbb", the answer is "b", with the length of 1.

    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring,

    "pwke" is a subsequence and not a substring.
    */


    public int lengthOfLongestSubstring(String s){
        char[] sc = s.toCharArray();
        HashMap<Character, Integer> cm = new HashMap<Character, Integer>();

        int j = 0, maxLength = 0;
        for (int i = 0; i < sc.length; ++i) {
            char cur = sc[i];
            if (cm.containsKey(cur)) {
                maxLength = Math.max(i - j, maxLength);
                j = Math.max(j, cm.get(cur) + 1);
            }
            cm.put(cur, i);
        }
        return Math.max(sc.length - j, maxLength);
    }
}
