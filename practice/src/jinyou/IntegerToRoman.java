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
            while (s >= values[i]) {
                s -= values[i];
                sb.append(str[i]);

            }
        }
        return sb.toString();
    }

}

