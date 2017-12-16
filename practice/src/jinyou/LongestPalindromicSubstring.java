package jinyou;

public class LongestPalindromicSubstring {
    /*
    Given a string s, find the longest palindromic substring in s.
    You may assume that the maximum length of s is 1000.

    */

    private int lo, maxLen;
    public  String longestPalidrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;

        }
        for (int i = 0; i < len - 1; i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }
    private void expandAroundCenter(String s, int left, int right) {
        int j = left, k =right;
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
    /*
    expand around center, in the whole string of length n, we will have 2n - 1 centers,
    then we iterate i from the 0 index of the string to the last number in string, and for each
    i we expand the palindrome as the center of i, then update maxlen as each time, until the largest
    one found.
    */