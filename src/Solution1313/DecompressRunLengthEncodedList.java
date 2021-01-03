package Solution1313;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
		
		int arrayLength=0;
		for(int i=0;i<nums.length;i+=2) {
			int x = nums[i];
			arrayLength+=x;
		}
		int[] newArray = new int[arrayLength];
		int index = 0;
		for(int i=0;i<nums.length;i+=2) {
		 	int freq = nums[i];
		 	int val = nums[i+1];
		 	
		 	for(int j=0;j<freq;j++) {
		 		newArray[index++]=val;
		 	}
		}
		return newArray;
	}
}
