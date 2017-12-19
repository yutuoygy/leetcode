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
            /*
            we use the expandfromcenter method twice to make sure we cover the smallest case that we have a at i=0, and
            aa at i=0,1 as a palindrome.
             */
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
            /*
            the reason why we use k - j - 1 is because we what we need is the length of substring.
             */
            lo = j + 1;
            /*
            when the left pointer failed to pass the check, we need to record the start position of the palindrome, which
            means we need to find the left pointer before it fail to pass the check.
             */
            maxLen = k - j - 1;
        }
    }
}
    /*
    expand around center, in the whole string of length n, we will have 2n - 1 centers,
    then we iterate i from the 0 index of the string to the last number in string, and for each
    i we expand the palindrome as the center of i, then update maxlen as each time, until the largest
    */