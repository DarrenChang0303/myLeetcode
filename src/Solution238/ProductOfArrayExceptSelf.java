package Solution238;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] right = new int[nums.length];
        int[] left = new int[nums.length];
        int[] output = new int[nums.length];
        right[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            right[i] = right[i-1] * nums[i-1];
        }
        int l = 1;
        left[nums.length-1]=1;
        for (int i = nums.length - 1; i >+ 0; i--) {
            left[i-1] = l * nums[i];
            l *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = right[i] * left[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{4,5,1,8,2};

        int[] right = new int[nums.length];
        int[] left = new int[nums.length];
        int[] output = new int[nums.length];
        right[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            right[i] = right[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(right));
        int l = 1;
        left[nums.length-1]=1;
        for (int i = nums.length - 1; i >+ 0; i--) {
            left[i-1] = l * nums[i];
            l *= nums[i];
        }
        System.out.println(Arrays.toString(left));
        for (int i = 0; i < nums.length; i++) {
            output[i] = right[i] * left[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
