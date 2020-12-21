package Solution1512;

public class NumberOfGoodPairs {
    public NumberOfGoodPairs() {
		
	}
	public int numIdenticalPairs(int[] nums) {
		int k=0;
		for (int i = 0; i < nums.length; i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					if(i<j) {
					k++;	
					System.out.println("("+i+k+")");
					}
				}
			}

		}
		return k;
	}
}
