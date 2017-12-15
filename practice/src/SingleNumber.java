import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    /*
    Given an array of integers, every element appears twice except for one. Find that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     */

    public static void main(String[] args) {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{1, 1, 2, 3, 3, 4, 4, 5, 5};
        int[] nums3 = new int[]{1, 1, 2, 3, 3, 4, 4};
        int[] nums4 = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
        System.out.println(singleNumber(nums4));
        System.out.println("this is a new result");
        System.out.println(singleNumber1(nums1));
        System.out.println(singleNumber1(nums2));
        System.out.println(singleNumber1(nums3));
        System.out.println(singleNumber1(nums4));
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    public static int singleNumber1(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i], count + 1);

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
            }
        }
        return res;
    }
}

