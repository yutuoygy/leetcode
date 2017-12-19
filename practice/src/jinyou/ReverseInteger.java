package jinyou;

public class ReverseInteger {
    /*
    Reverse digits of an integer.
    *
    * Example1: x = 123, return 321 Example2: x = -123, return -321
    *
    * */

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
                return 0;

            result = newResult;
            x = x / 10;
        }
        return result;
    }
}


/* here is some problems need to pay attentions to, when the
    integer's last digit is 0, and what happened if there is a
    over flow as the max of the 32 bit integer is 2147483647, so when
    we meet the situation that there exist an overflow we return 0.
 *
 */
