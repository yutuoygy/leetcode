package jinyou;

public class IntegerToRoman {
    /*
    Given an integer, convert it to a roman numeral.
    Input is guaranteed to be within the range from 1 to 3999.

    I	one	            unus
    V	five	        quique
    X	ten	            decem
    L	fifty	        quinquaginta
    C	one hundred	    centum
    D	five hundred	quingenti
    M	one thousand	mille
     */

    public String intToRoman(int s) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < values.length; i++) {
            /*
            iterate in the given integer
             */
            while (s >= values[i]) {
                s -= values[i];
                /*
                s - 1000 until s < 1000
                then s - 900....
                 */
                sb.append(str[i]);
                /*
                append into the string builder to record the number
                for example 3000 --> MMM
                 */

            }
        }
        return sb.toString();
    }

}

/*
as the given number must within the range of 1-3999
we can start from the largest of the roman number M
which is 1000, then we use the given integer to deduce
the largest number until it was less than value[i].
 */