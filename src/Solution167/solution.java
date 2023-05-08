package Solution167;

import java.util.Arrays;

public class solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPoint = 0;
        int rightPoint = numbers.length - 1;
        while (leftPoint < rightPoint) {
            int sum = numbers[leftPoint] + numbers[rightPoint];
            if (sum == target) {
                return new int[]{leftPoint + 1, rightPoint + 1};
            }else if(sum>target){
                rightPoint--;
            }else if(sum<target){
                leftPoint++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        solution test = new solution();
        int[] nums = {2,3,4};
        System.out.println(Arrays.toString(test.twoSum(nums,7)));
    }
}
