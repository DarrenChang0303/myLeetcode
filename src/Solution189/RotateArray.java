package Solution189;

import java.util.Arrays;

//TODO: check leetcode

public class RotateArray {

    public static void main(String[] args) {
        // int nums[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int nums[] = new int[] { -1,-100,3,99 };
        RotateArray test = new RotateArray();

        // System.out.println(Arrays.toString(nums));
        test.rotate(nums, 2);
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {

        int[] ans = new int[nums.length];
        // ans = nums;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i];
        }
        // System.out.println(Arrays.toString(ans));
        if (k > nums.length) {
            k = k % nums.length;
        }
        for (int i = 0, j = k; i < (nums.length - k); i++, j++) {
            nums[j] = ans[i];
        }
        // System.out.println(Arrays.toString(ans));
        if (k > 2) {
            for (int i = k+1, j = 0; i < nums.length; i++, j++) {
                nums[j] = ans[i];
            }
        }else{
            for (int i = k, j = 0; i < nums.length; i++, j++) {
                nums[j] = ans[i];
            }
        }

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(nums));
    }

}
