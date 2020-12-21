package Solution15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				for (int k = 0; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						if (i != j || i != k || j != k) {
							list.add(Arrays.asList(nums[i], nums[j], nums[k]));
						}
					}
				}
			}

		}

		return list;
	}
}
