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
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}