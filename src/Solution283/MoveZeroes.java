package Solution283;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        for (int i = 0, j = 1; j < nums.length; j++) {
            if (nums[i] == 0 & nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
            }
            if (nums[i] == 0 & nums[j] == 0) {
                continue;
            }
            i++;
        }
    }

}
