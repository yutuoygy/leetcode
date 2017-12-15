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

/* the key in hashmap is the character in the string, and the value in the hashmap is the position of the key,
scan with i and store the character and their position as pair in the hashmap, then once we found the key that
already existed in the hashmap, we move the j to the position we previously find and update the maxLength
 */