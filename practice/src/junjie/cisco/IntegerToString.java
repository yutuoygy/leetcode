package junjie.cisco;

import java.util.HashMap;

public class IntegerToString {

    public static void main(String args[]) {
        System.out.println(integerToWords(122));
    }

    public static String integerToWords(int input) {
        StringBuilder sb = new StringBuilder();
        String whiteSpace = " ";
        char[] inputCharArray = String.valueOf(input).toCharArray();
        for (int i = 0; i <= inputCharArray.length - 1; i++) {
            if (Dictionary().containsKey(String.valueOf(inputCharArray[i]))) {
                sb.append(Dictionary().get(String.valueOf(inputCharArray[i])));
                sb.append(whiteSpace);
            }
        }
        return sb.toString();
        //return String.valueOf(input);
    }

    private static HashMap<String, String> Dictionary() {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put(String.valueOf(0), "zero");
        dictionary.put(String.valueOf(1), "one");
        dictionary.put(String.valueOf(2), "two");
        dictionary.put(String.valueOf(3), "three");
        dictionary.put(String.valueOf(4), "four");
        dictionary.put(String.valueOf(5), "five");
        dictionary.put(String.valueOf(6), "six");
        dictionary.put(String.valueOf(7), "seven");
        dictionary.put(String.valueOf(8), "eight");
        dictionary.put(String.valueOf(9), "nine");
        return dictionary;
    }
}
