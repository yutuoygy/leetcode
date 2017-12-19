package jinyou;

public class ContainerWithMostWater {
    /*
    Given n non-negative integers a1, a2, ..., an, where each represents
    a point at coordinate (i, ai). n vertical lines are drawn such that
    the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
    which together with x-axis forms a container, such that the container
    contains the most water.

     y ^
    |
    |     a2
    |     |  a3          an
    |  a1 |  |     a5    |
    |  |  |  |  a4 |     |
    |  |  |  |  |  | ..  |
    --------------------------->
   0   1  2  3  4  5 ..  n     x
     */

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        /*
        max used to record the most water can be contained in
        the area, the left bound start with 0, and the right bound
        start from the right bound.
         */
        while (left < right) {
            max = Math.max(Math.min(height[left], height[right]) * (right - left), max);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
                /*
                we use left++ or right-- to iterate the whole array,
                the reason why we choose the shorter part is beacuse
                it is a water container.

                then we always move the shorter height, then we will
                finally find the result.
                 */
            }
        }
        return max;
    }
}
