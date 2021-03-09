package Solution268;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[nums.length-1]+1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                ans = i;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MissingNumber test = new MissingNumber();
        int[] nums = new int[]{0};

        System.out.println(test.missingNumber(nums));
    }
    
}
