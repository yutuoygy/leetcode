package jinyou;

public class LongestCommonPrefix {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.
    （最长公共前缀）

    ex: "abcdefg"
        "abcdefghijk"
        "abcdfghijk"
        "abcef"
        the longest prefix string is abc
     */

    public String longestCommonPrefix(String[] strs) {

    }

}


/*
思考：way 1： 先确定basic case,当strs == null 或者 strs.length == 0,公共String的长度肯定小于等于String
    组内最短的字符串，但是我们还是需要比较所有的字符串。
    way 2: 如果我们能找出这个array 里面相差最大的两个String，那个我们就可以直接比较这两个String来得到这个array
    中所有的String的longest common prefix!
    相比较而言，way2的可行性更高，我们可以通过arrays.sort方法对所有字符串进行排序，然后直接对相差最大的两个字符串的
    每一个index进行比较！


 */