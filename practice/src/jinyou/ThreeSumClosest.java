package jinyou;

import java.util.Arrays;

public class ThreeSumClosest {
    /*
    Given an array S of n integers,
    find three integers in S such that the sum is closest to a given number,
    target. Return the sum of the three integers. You may assume that each
    input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.
    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

     */

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        /*
        sort array in a specific order.
         */
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        /*
        identify the result which will be used to compare to
        the target and sum.
         */

        for (int i = 0; i < nums.length - 2; i++) {
            /*
            the same as the 3Sum problem with the num.length - 2
            problem.
             */
            int start = i + 1, end = nums.length -1;
            /*
            identify two other pointers used to iterate with the array.
             */
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    /*
                    comapre the abs to see the
                     */
                    result = sum;
                }
            }
        }
        return result;
    }

}
