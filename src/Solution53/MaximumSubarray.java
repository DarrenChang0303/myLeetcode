package Solution53;

public class MaximumSubarray {
    // Solution 53
    // 確認第一個數值為正整數時往後累加，宣告一變數儲存累加結果(使用"比較"保留最大累加結果)
    public int maxSubArray(int[] nums) {
        int sum = 0;
        Integer maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
