package junjie.cisco;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortedArray {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 3, 5, 7);
        List<Integer> newList = new ArrayList<Integer>();
        newList = insert(myList, 4);
        System.out.println(newList);
    }

    public static List<Integer> insert(List<Integer> array, int target) {
        List<Integer> res = new ArrayList<Integer>(array.size() + 1);
        for(int i = 0; i < array.size() - 1 ; i++) {
            if(target < array.get(i)) {
                if (!res.contains(target)){
                    res.add(target);
                } else {

                }
            } else {
                res.add(array.get(i));
            }
        }
        return res;
    }
}
