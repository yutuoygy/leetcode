package jinyou;

public class PalindromeNumber {
    /*
    Determine whether an integer is a palindrome. Do this without extra space
     */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

}



/*
sometimes people may use reverse integer to deal with the problem,
but as the previous question shows, there will exist overflow situations
so this way is not going to work.

then use the regular way to reverse the x as rev, when we found x = rev
then it is a palindrome.
 */