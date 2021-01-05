package Solution977;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length;i++){
             int a = nums[i];
            ans[i]=a*a;
        }
        Arrays.sort(ans);

        return ans;
    }
    
}
