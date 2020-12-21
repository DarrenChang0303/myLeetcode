package Solution35;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // int j=0;
        // for(int i=0;i<nums.length;i++){
        // if(nums[i]==target){
        // return i;
        // }else if(nums[i]<target){
        // j=i+1;
        // }
        // }
        // return j;
        int first = 0;
        int end = nums.length - 1;
        int mid = (first + end) / 2;

        while (first <= end) {
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                first = mid + 1;
            }
            mid = (first + end) / 2;
        }
        return first;

    }

}

