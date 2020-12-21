package Solution1470;

import java.util.Arrays;

public class ShuffleTheArray {
    
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.print(Arrays.toString(shuffle(array, 2)));
	}

	public static int[] shuffle(int[] nums, int n) {
//		int array[] = new int[2 * n];
//		int start = 0, mid = n;
//		for (int i = 0; i < 2 * n; i = i + 2) {
//			array[i] = nums[start++];
//			array[i + 1] = nums[mid++];
//		}
//		return array;
		int a = 0, b = 2;
		int[] array1 = new int[n];
		int[] array2 = new int[2 * n];
		int[] arrayFinal = new int[2 * n];

		for (int i = 0; i < n; i++) {
			array1[i] = nums[i];
		}
		for (int k = n; k < 2 * n; k++) {
			array2[k] = nums[k];
		}

		for (int j = 0; j < 2 * n; j = j + 2) {

			arrayFinal[j] = array1[a++];
			arrayFinal[j + 1] = array2[b++];
		}
		return arrayFinal;
	}
}
