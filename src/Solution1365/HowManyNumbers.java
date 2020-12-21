package Solution1365;

import java.util.Arrays;

public class HowManyNumbers {
    public static void main (String[] args) {
		int[] array =new int[] {8,1,2,3,3};
		System.out.print(Arrays.toString(smallerNumbersThanCurrent(array)));
		
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int i, j;
		int[] arrayStore =new int [nums.length];
		for( i=0 ; i<nums.length ; i++) {
			int k =0;
//			System.out.println(i);
				for(j=0 ; j<nums.length ; j++) {
					if(nums[i]>nums[j]) {
					k++;
//					System.out.print(Arrays.toString(nums));
//					System.out.println(k);
//					System.out.print(i);
//					System.out.print(j);
//					System.out.print("\n");
//					System.out.print(nums.length);
				}
				}
//				System.out.print(i);
//				System.out.print(j);
//				System.out.print(k);
			arrayStore[i] = k;
//			System.out.print(Arrays.toString(arrayStore));
		}
//		System.out.print(Arrays.toString(nums));
		return arrayStore;
	}
}
