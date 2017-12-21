package jinyou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /*
    Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
    Find all unique triplets in the array which gives the sum of zero.
    Note: The solution set must not contain duplicate triplets.

    For example, given array S = [-1, 0, 1, 2, -1, -4],

    A solution set is:
    [
    [-1, 0, 1],
    [-1, -1, 2]
    ]
     */

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            /*
            i + 2 < nums.length as we have two pointer k and j behind i
            and index of k, j should never equals to index i, so that's
            why we make i < nums.length - 2.
             */
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
                /*
                skip the same result
                 */
            }
            int j = i + 1, k = nums.length - 1;
            int target =- nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                        /*
                        skip the same result as nums[j] = nums[j - 1]
                         */
                    }
                    while (j <k && nums[k] == nums[k + 1]) {
                        k--;
                        /*
                        skip the same result as nums[k] = nums[k + 1]
                         */
                    }
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;

                    /*
                    as the array has been sorted, so the number is in a increase way.
                     */
                }
            }
        }
        return result;

    }

}
