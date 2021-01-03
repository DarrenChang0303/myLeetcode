package Solution136;

import java.util.Arrays;

public class SingleNumber {
    // Solution 136
public static void main(String[] args) {
    int[] abc = new int[]{2,2,3,4,5,4,5};
    SingleNumber test = new SingleNumber();

        System.out.println(test.singleNumber(abc));

    
}
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i++;
            }
        }
        return nums[nums.length - 1];
    }

}
