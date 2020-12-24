package Solution229;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement test = new MajorityElement();
        int[] input = new int[]{1,2,2,1,4,2,1,2,1,3};
        System.out.println(test.majorityElement(input));

    }

    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int size = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count > size & (!ans.contains(nums[i]))) {
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
    }

}
