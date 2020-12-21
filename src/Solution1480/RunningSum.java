package Solution1480;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
		int[] array1 =new int[] { 1, 2, 3 };
		System.out.print(Arrays.toString(runningSum(array1)));

	}

	public static int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];	// 建立與nums長度一樣的新array ans
		System.out.print(nums.length);
		if(nums.length == 1) {
			ans = nums;
			return ans;
		}
		
		for (int i = 1; i < nums.length; i++) {
			ans[0] = nums[0];
			ans[i] = nums[i] + nums[i-1];
		}
			
//			for (int j = 0; j < nums.length; j++) {
//				if (i <= j) {
//					k = k + nums[j];
//					k = k;
//				}
//			}
//			ans[i] = k;
//		}
		return ans;
	}
}
