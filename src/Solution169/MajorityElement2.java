package Solution169;

public class MajorityElement2 {
    public int majorityElement(int[] nums) {

        int res = nums[0], count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == res) {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                res = nums[i];
                count++;
            }
        }
        return res;
    }
}
