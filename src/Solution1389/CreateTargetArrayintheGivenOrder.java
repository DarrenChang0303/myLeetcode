package Solution1389;

public class CreateTargetArrayintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {

		int[] Array = new int[index.length];
		int[] newArra = new int[index.length];
		int x = index.length;
		for (int i = 0; i < x; i++) {
			if (i != index[i]) {
				for (int k = x - 1; k > index[i]; k--) {
					Array[k] = Array[k - 1];
				}
				Array[index[i]] = nums[i];
			} else {
				Array[index[i]] = nums[i];
			}
			newArra = Array;

		}

		return newArra;
	}
}
